/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cv.mikusher.wekaControler.weka.testeweka;

import java.util.Random;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author latavares
 */
public class TesteWeka {

	private static final String CAMINHO_FILE = "src/cv/mikusher/weka/testeweka/vendas_tst.arff";

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws Exception {

		// criação do datasouce, indicando o caminho da BD "vendas"
		DataSource ds = new DataSource(CAMINHO_FILE);

		// pega as instancias da base de dados
		Instances ins = ds.getDataSet();

		// indicar a classe da que vai ser feito a previsão {3} "@attribute gasta_muito
		// {Nao, Sim}"
		ins.setClassIndex(3);

		// algoritmo em que vai ser utilizado na previsão
		NaiveBayes nb = new NaiveBayes();
		nb.buildClassifier(ins);

		/**
		 * criando o classificador - ele recebe o nimero de atributos que tem na BD
		 * {sexo, idade, filhos, gasta_muito}
		 */
		DenseInstance novo = new DenseInstance(4);

		// associar o novo elemento da previsão - relacionar o novo com o a base de
		// dados
		novo.setDataset(ins);

		/**
		 * os atributos do novo elemento -- o atributo da previsão não deve ser
		 * passada @attribute gasta_muito por ser este que queremos prever
		 */
		novo.setValue(0, "M"); // sexo
		novo.setValue(1, randonNumberGen(18, 80)); // idade vai ser um random de 18-80
		novo.setValue(2, "Sim"); // filho

		// fazendo a previsão do elemento novo
		double probabilidade[] = nb.distributionForInstance(novo);

		// imprimindo os resultados
		System.out.println("Não: " + probabilidade[0]);
		System.out.println("");
		System.out.println("Sim: " + probabilidade[1]);

	}

	// para a idade vamos usar um random
	public static int randonNumberGen(int min, int max) {

		Random randomGenerator = new Random();
		int randomIdade = randomGenerator.nextInt((max - min) + 1) + min;
		return randomIdade;
	}

}
