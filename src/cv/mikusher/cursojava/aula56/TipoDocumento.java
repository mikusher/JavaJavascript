package cv.mikusher.cursojava.aula56;

public enum TipoDocumento {
    CPF {
        @Override
        public String geraNumeroTeste() {
            return null;
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            return null;
        }
    };

    public abstract String geraNumeroTeste();
}
