




package cv.mikusher.fat16;





public class Cluster {

    public String nome;
    public double tamanho;
    public int[]  clusters = new int[2];





    public Cluster(String nome, double tamanho) {

        this.nome = nome;
        this.tamanho = tamanho;
    }





    public String getNome() {

        return nome;
    }





    public void setNome(String nome) {

        this.nome = nome;
    }





    public double getTamanho() {

        return tamanho;
    }





    public void setTamanho(int tamanho) {

        this.tamanho = tamanho;
    }





    public int getClusters(int posicao) {

        return clusters[posicao];
    }





    public void setClusters(int[] clusters) {

        this.clusters = clusters;
    }
}