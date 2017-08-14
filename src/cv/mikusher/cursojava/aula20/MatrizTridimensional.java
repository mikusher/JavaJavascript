package cv.mikusher.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {

		int[][][] mTridimensional = new int[3][3][3];

		for (int i = 0; i < mTridimensional.length; i++) {
			for (int j = 0; j < mTridimensional[i].length; j++) {
				for (int k = 0; k < mTridimensional[i][j].length; k++) {
					mTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		int soma = 0;
		int somaPares = 0;
		int somaImpar = 0;
		for (int i = 0; i < mTridimensional.length; i++) {
			for (int j = 0; j < mTridimensional[i].length; j++) {
				for (int k = 0; k < mTridimensional[i][j].length; k++) {

					soma += mTridimensional[i][j][k];

					if (mTridimensional[i][j][k] % 2 == 0) {
						somaPares += mTridimensional[i][j][k];
					} else {
						somaImpar += mTridimensional[i][j][k];
					}
				}
			}
		}
		System.out.println("Soma total: " + soma + "\nSoma Pares: " + somaPares + "\nSoma Impares: " + somaImpar);
	}

}
