




package cv.mikusher.fat16;





import javax.swing.JOptionPane;





public class ParticionarHD {

    public int   tamanho;
    public int   cluster;
    public int[] quantidadeClusters;
    Cluster[]    arquivos;





    public ParticionarHD(int tamanho, int cluster, int quantidade) {

        this.tamanho = tamanho;
        this.cluster = cluster;
        this.quantidadeClusters = new int[quantidade];
        this.arquivos = new Cluster[quantidade];
    }





    public int getTamanho() {

        return tamanho;
    }





    public void setTamanho(int tamanho) {

        this.tamanho = tamanho;
    }





    public int getCluster() {

        return cluster;
    }





    public void setCluster(int cluster) {

        this.cluster = cluster;
    }





    public int getQuantidadeCluster() {

        return quantidadeClusters.length;
    }





    public int getClusterOcupados(int posicao) {

        return quantidadeClusters[posicao];
    }





    public void setClusterOcupados(int posicao, int valor) {

        this.quantidadeClusters[posicao] = valor;
    }





    public static ParticionarHD criaParticao(int tamanho) {

        int quantidadeCluster;
        int cluster;
        ParticionarHD particao;

        if (tamanho <= 256) {

            cluster = 4;
            quantidadeCluster = (tamanho * 1024) / cluster;
            particao = new ParticionarHD(tamanho, cluster, quantidadeCluster);
            for (int i = 0; i < quantidadeCluster; i++) {

                particao.quantidadeClusters[i] = 0;

            }

            return particao;

        } else if ((tamanho > 256) && (tamanho <= 512)) {

            cluster = 8;
            quantidadeCluster = (tamanho * 1024) / cluster;
            particao = new ParticionarHD(tamanho, cluster, quantidadeCluster);
            for (int i = 0; i < quantidadeCluster; i++) {

                particao.quantidadeClusters[i] = 0;

            }

            return particao;

        } else if ((tamanho > 512) && (tamanho <= 1024)) {

            cluster = 16;
            quantidadeCluster = (tamanho * 1024) / cluster;
            particao = new ParticionarHD(tamanho, cluster, quantidadeCluster);
            for (int i = 0; i < quantidadeCluster; i++) {

                particao.quantidadeClusters[i] = 0;

            }

            return particao;

        } else if ((tamanho > 1024) && (tamanho <= 2048)) {

            cluster = 32;
            quantidadeCluster = (tamanho * 1024) / cluster;
            particao = new ParticionarHD(tamanho, cluster, quantidadeCluster);
            for (int i = 0; i < quantidadeCluster; i++) {

                particao.quantidadeClusters[i] = 0;

            }

            return particao;

        } else {
            particao = new ParticionarHD(0, 0, 0);
            return particao;
        }

    }





    public void adicionarArquivo(Cluster arq) {

        int verificaEspaco = 0;
        int espaco = 0;
        int inicio = 0;
        int fim = 0;

        for (int i = 0; i < quantidadeClusters.length; i++) {

            if (quantidadeClusters[i] != 0) {

                if (espaco < verificaEspaco) {

                    fim = i - 1;
                    espaco = verificaEspaco;
                    inicio = fim - (espaco - 1);

                }

                verificaEspaco = 0;

            } else {

                verificaEspaco += 1;

            }

            if (i == (quantidadeClusters.length - 1)) {

                if (espaco < verificaEspaco) {

                    fim = i;
                    espaco = verificaEspaco;
                    inicio = fim - (espaco - 1);

                }

            }

            if (((arq.tamanho) / this.cluster) <= (espaco)) {

                break;

            }

        }

        if (((arq.tamanho) / this.cluster) > (espaco)) {

            JOptionPane.showMessageDialog(null, "Erro: Não tem espaço suficiente em disco para o arquivo");

        } else {

            fim = inicio + (int) Math.ceil(((arq.tamanho) / this.cluster)) - 1;

            arq.clusters[0] = inicio;
            arq.clusters[1] = fim;

            int start = arq.clusters[0];
            int end = arq.clusters[1];

            while (start <= end) {

                setClusterOcupados(start, 1);
                start += 1;

            }

            for (int i = 0; i < arquivos.length; i++) {
                if (arquivos[i] == null) {
                    arquivos[i] = arq;
                    break;
                }
            }

        }

    }





    public void excluirArquivo(String nome) {

        boolean excluiu = false;

        for (int i = 0; i < arquivos.length; i++) {

            if (arquivos[i].getNome()
                           .equals(nome)) {

                for (int j = arquivos[i].getClusters(0); j <= arquivos[i].getClusters(1); j++) {

                    setClusterOcupados(j, 0);

                }
                excluiu = true;
                arquivos[i] = null;
                break;
            }
        }
        if (excluiu == false) {
            System.err.println("Erro: Não existe o arquivo com nome: " + nome);
        }
    }





    public static void main(String[] args) {

        ParticionarHD particao = ParticionarHD.criaParticao(256);
        Cluster arquivo = new Cluster("LuItLu", 7.15);

        particao.setClusterOcupados(16000, 1);
        particao.setClusterOcupados(48000, 1);

        particao.adicionarArquivo(arquivo);

    }
}