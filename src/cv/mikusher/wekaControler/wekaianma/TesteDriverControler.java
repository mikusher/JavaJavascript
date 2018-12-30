package cv.mikusher.wekaControler.wekaianma;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

import java.sql.SQLException;
import java.util.Random;

public class TesteDriverControler {
    public static void main(String[] args) throws ClassNotFoundException,
            SQLException, Exception {
        InstanceQuery query = new InstanceQuery();
        query.setUsername("postgres");
        query.setPassword("mikusher");
        query.setQuery("SELECT sexo,idade,filhos,gasta_muito FROM vendas LIMIT 20");

        Instances data = query.retrieveInstances();

        // indicar a classe da que vai ser feito a previsão {3} "@attribute gasta_muito
        // {Nao, Sim}"
        data.setClassIndex(3);

        // algoritmo em que vai ser utilizado na previsão
        NaiveBayes nb = new NaiveBayes();
        nb.buildClassifier(data);

        /**
         * criando o classificador - ele recebe o nimero de atributos que tem na BD
         * {sexo, idade, filhos, gasta_muito}
         */
        DenseInstance newCliente = new DenseInstance(4);
        newCliente.setDataset(data);

        /**
         * os atributos do novo elemento -- o atributo da previsão não deve ser
         * passada @attribute gasta_muito por ser este que queremos prever
         */
        newCliente.setValue(0, "M"); // sexo
        newCliente.setValue(1, randomNumberGen(18, 80)); // idade vai ser um random de 18-80
        newCliente.setValue(2, "Sim"); // filho

        // fazendo a previsão do elemento novo
        double[] probabilite = nb.distributionForInstance(newCliente);

        // imprimindo os resultados
        System.out.println("Probabilidade de compra: ");
        System.out.println("Não: " + probabilite[0]);
        System.out.println("Sim: " + probabilite[1]);

    }

    private static int randomNumberGen(int min, int max) {

        Random randomGenerator = new Random();
        return randomGenerator.nextInt((max - min) + 1) + min;
    }

}
