package cv.mikusher.cursojava.aula25;

public class TestarCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
	}

}
