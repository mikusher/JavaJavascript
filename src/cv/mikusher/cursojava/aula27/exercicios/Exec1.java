package cv.mikusher.cursojava.aula27.exercicios;

public class Exec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lmp1 = new Lampada();
		Lampada lmp2 = new Lampada();
		lmp1.kw = 10;
		lmp1.potencia = 45;
		lmp1.estadoLampada(true);
		lmp2.kw = 50;
		lmp2.potencia = 65;
		lmp2.estadoLampada(false);

		System.out.println("Estado da lampada 1 ");
		lmp1.mostrarLampada();

		System.out.println("\nEstado da lampada 2 ");
		lmp2.mostrarLampada();

	}

}
