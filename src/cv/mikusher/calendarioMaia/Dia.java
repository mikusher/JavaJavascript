




package cv.mikusher.calendarioMaia;





public class Dia {

    private int[] tamanhoGeralDia = new int[6];
    private int[] domingo      = new int[] { 1, 8, 15, 22, 29, 36 };
    private int[] segunda      = new int[] { 2, 9, 16, 23, 30, 37 };
    private int[] terca        = new int[] { 3, 10, 17, 24, 31, 38 };
    private int[] quarta       = new int[] { 4, 11, 18, 25, 32, 39 };
    private int[] quinta       = new int[] { 5, 12, 19, 26, 33, 40 };
    private int[] sexta        = new int[] { 6, 13, 20, 27, 34, 41 };
    private int[] sabado       = new int[] { 7, 14, 21, 28, 35, 42 };





    /**
     * 
     */
    public Dia() {
        super();
    }



    public String Dia(int dia) {

        String diaSemana = null;
        for (int i = 0; i < tamanhoGeralDia.length; i++) {
            if (dia == domingo[i]) {
                diaSemana = "Domingo";
            } else if (dia == segunda[i]) {
                diaSemana = "Segunda";
            } else if (dia == terca[i]) {
                diaSemana = "Terca";
            } else if (dia == quarta[i]) {
                diaSemana = "Quarta";
            } else if (dia == quinta[i]) {
                diaSemana = "Quinta";
            } else if (dia == sexta[i]) {
                diaSemana = "Sexta";
            } else if (dia == sabado[i]) {
                diaSemana = "Sabado";
            }
        }
        return diaSemana;
    }





    public int[] getDomingo() {

        return domingo;
    }





    public int[] getSegunda() {

        return segunda;
    }





    public int[] getTerca() {

        return terca;
    }





    public int[] getQuarta() {

        return quarta;
    }





    public int[] getQuinta() {

        return quinta;
    }





    public int[] getSexta() {

        return sexta;
    }





    public int[] getSabado() {

        return sabado;
    }

}
