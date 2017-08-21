package cv.mikusher.cursojava.aula24.exercicios;

public class LivroDeLivraria {

	public static void main(String[] args) {
		Livros lv = new Livros();
		lv.autor = "Luis";
		lv.capaDura = true;
		lv.desconto = 10;
		lv.diaLancamento = 19;
		lv.numeroPagina = 1150;
		lv.tipo = "Conto";

		System.out.println("Autor: " + lv.autor + "\nTipo: " + lv.tipo);
	}
}
