package cv.mikusher.cursojava.aula27;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}
}
