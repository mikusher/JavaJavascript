




package cv.mikusher.cursojava.aula33.exercicios;





public class Exec1 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Lampada lmp1 = new Lampada();
        lmp1.setKw(10);
        lmp1.setPotencia(45);
        lmp1.setEstado(true);

        Lampada lmp2 = new Lampada();
        lmp2.setKw(50);
        lmp2.setPotencia(65);
        lmp2.setEstado(false);

        Lampada lmp3 = new Lampada(false);
        lmp3.setKw(50);
        lmp3.setPotencia(65);

        System.out.println("Estado da lampada 1 ");
        lmp1.mostrarLampada();

        System.out.println("\nEstado da lampada 2 ");
        lmp2.mostrarLampada();

        System.out.println("\nEstado da lampada 3 ");
        lmp3.mostrarLampada();

    }

}
