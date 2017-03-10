/*
 * Copyright (C) 2017 Miky Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.serialized;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 *
 * @author Miky Mikusher
 */
public class Deserializar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado emp = null;
        try {
            FileInputStream fileEntrada = new FileInputStream("E:/ser/empregado.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileEntrada);
            emp = (Empregado) inputStream.readObject();
            inputStream.close();
            fileEntrada.close();
      }catch(IOException e) {
         e.printStackTrace();
         return;
      }catch(ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }

      System.out.println("Deserialized Empregado...");
      System.out.println("Numero: " + emp.getNumero());      
      System.out.println("Nome: " + emp.getNome());
      System.out.println("Idade: " + emp.getIdade());
      System.out.println("Endereço: " + emp.getEndereco());
      System.out.println("SSN: " + emp.getSsn());
   }
}
