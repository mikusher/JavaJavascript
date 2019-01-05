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
class ModelController {

  /**
   *
   * @param query
   */
  ModelController(InstanceQuery query) {
    String USER_DB = "postgres";
    query.setUsername(USER_DB);
    String PASS_DB = "mikusher";
    query.setPassword(PASS_DB);
    String QUERY_DB = "SELECT sexo,idade,filhos,gasta_muito FROM vendas";
    query.setQuery(QUERY_DB);
  }

  /**
   *
   * @param query
   * @return
   */
  Instances instanceDataPresent(InstanceQuery query) {
    Instances data = null;
    try {
      data = query.retrieveInstances();
      data.setClassIndex(data.numAttributes() - 1);
    } catch (Exception ex) {
      Logger.getLogger(ModelController.class.getName()).log(Level.SEVERE, null, ex);
    }
    return data;

  }

  /**
   *
   * @param data
   * @return
   * @throws Exception
   */
  NaiveBayes naiveUse(Instances data) throws Exception {
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
  DenseInstance newClientPromoteUser(int index, Instances data) {
    DenseInstance newClient = new DenseInstance(index);
    newClient.setDataset(data);

    return newClient;
  }

  /**
   *
   * @param clientWData
   * @param sexo
   * @param idade
   * @param filho
   * @return
   */
  DenseInstance clientDataInput(DenseInstance clientWData, String sexo, int idade, String filho) {
    clientWData.setValue(0, sexo); // sexo
    clientWData.setValue(1, idade); // idade
    clientWData.setValue(2, filho); // filho
    return clientWData;
  }

}
