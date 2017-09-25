




package cv.mikusher.cursojava.aula74.exercicios;





public enum CorSemaforo {
    VERDE(1000),
    AMARELO(300),
    VERMELHO(2000);

    private int tempo;





    private CorSemaforo(int tempo) {

        this.tempo = tempo;
    }





    public int getTempo() {

        return tempo;
    }

}
