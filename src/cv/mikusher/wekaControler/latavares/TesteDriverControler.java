package cv.mikusher.wekaControler.latavares;

import java.sql.SQLException;
import java.util.Random;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

public class TesteDriverControler {

  static Random randomGenerator = new Random();

  // new user data
  static String sexo = "M";
  static int idade = randomNumberGen(18, 80);
  static String filhos = "Sim";

  public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
    Instances data = prepareQuery();

    // indicar a classe da que vai ser feito a previsão {3} "@attribute gasta_muito
    // {Nao, Sim}"
    data.setClassIndex(data.numAttributes() - 1);

    // algoritmo em que vai ser utilizado na previsão
    NaiveBayes nb = new NaiveBayes();
    nb.buildClassifier(data);

    /**
     * criando o classificador - ele recebe o nimero de atributos que tem na BD {sexo, idade, filhos, gasta_muito}
     */
    DenseInstance newCliente = new DenseInstance(data.numAttributes());
    newCliente.setDataset(data);

    buildClient(newCliente);

    // fazendo a previsao do elemento novo
    double[] probabilite = nb.distributionForInstance(newCliente);

    printInputData();
    printProbabilityData(probabilite);

  }

  private static void buildClient(DenseInstance newCliente) {
    /**
     * os atributos do novo elemento -- o atributo da previsão não deve ser passada @attribute gasta_muito por ser este que queremos
     * prever
     */
    newCliente.setValue(0, sexo); // sexo
    newCliente.setValue(1, idade); // idade vai ser um random de 18-80
    newCliente.setValue(2, filhos); // filho
  }

  private static void printProbabilityData(double[] probabilite) {
    // imprimindo os resultados
    String result = (probabilite[0] >= probabilite[1] ? "Não Compra" : "Vai Comprar");

    System.out.println("Probabilidade de compra: ");
    System.out.println("Nao: " + probabilite[0]);
    System.out.println("Sim: " + probabilite[1]);
    System.out.println(result);
  }

  private static void printInputData() {
    System.out.println("--------New User In-----------");
    System.out.println("Sexo: " + sexo);
    System.out.println("Idade: " + idade);
    System.out.println("Filhos: " + filhos);
    System.out.println("------------------------------");
  }

  private static Instances prepareQuery() throws Exception {
    InstanceQuery query = new InstanceQuery();
    query.setUsername("postgres");
    query.setPassword("mikusher");
    query.setQuery("SELECT sexo,idade,filhos,gasta_muito FROM vendas");

    Instances data = query.retrieveInstances();
    return data;
  }

  private static int randomNumberGen(int min, int max) {
    return randomGenerator.nextInt((max - min) + 1) + min;
  }

}
