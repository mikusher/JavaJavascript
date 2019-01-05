/*
 * Copyright (C) 2019 Miky Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.wekaControler.latavares;

import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

/**
 *
 * @author Miky Mikusher
 */
public class ModelControler {

  final String QUERY_DB = "SELECT sexo,idade,filhos,gasta_muito FROM vendas";
  final String USER_DB = "postgres";
  final String PASS_DB = "mikusher";

  /**
   *
   * @param query
   */
  public ModelControler(InstanceQuery query) {
    query.setUsername(USER_DB);
    query.setPassword(PASS_DB);
    query.setQuery(QUERY_DB);
  }

  /**
   *
   * @param query
   * @param index
   * @return
   */
  public Instances instanceDataPresent(InstanceQuery query, int index) {
    Instances data = null;
    try {
      data = query.retrieveInstances();
      data.setClassIndex(index);
    } catch (Exception ex) {
      Logger.getLogger(ModelControler.class.getName()).log(Level.SEVERE, null, ex);
    }
    return data;

  }

  /**
   *
   * @param data
   * @return
   * @throws Exception
   */
  public NaiveBayes naiveUse(Instances data) throws Exception {
    NaiveBayes nb = new NaiveBayes();
    nb.buildClassifier(data);
    return nb;
  }

  /**
   *
   * @param index
   * @param data
   * @return
   */
  public DenseInstance newClientePromoveUser(int index, Instances data) {
    DenseInstance newCliente = new DenseInstance(index);
    newCliente.setDataset(data);

    return newCliente;
  }

  /**
   *
   * @param clienteWData
   * @param sexo
   * @param idade
   * @param filho
   * @return
   */
  public DenseInstance clientDataInput(DenseInstance clienteWData, String sexo, int idade, String filho) {
    clienteWData.setValue(0, sexo); // sexo
    clienteWData.setValue(1, idade); // idade
    clienteWData.setValue(2, filho); // filho
    return clienteWData;
  }

}
