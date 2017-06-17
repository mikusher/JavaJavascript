/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





package cv.mikusher.testeweka;





import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;





/**
 *
 * @author latavares
 */
public class TesteWeka {

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        DataSource ds = new DataSource("src/cv/mikusher/testeweka/vendas.arff");
        Instances ins = ds.getDataSet();
        // System.out.println(ins.toString());

        ins.setClassIndex(3);

        NaiveBayes nb = new NaiveBayes();
        nb.buildClassifier(ins);

        DenseInstance novo = new DenseInstance(4);
        novo.setDataset(ins);
        novo.setValue(0, "M");
        novo.setValue(1, "18-39");
        novo.setValue(2, "Sim");

        double probabilidade[] = nb.distributionForInstance(novo);
        System.out.println("Não: " + probabilidade[0]);
        System.out.println("");
        System.out.println("Sim: " + probabilidade[1]);
    }

}
