/*
 * Copyright (C) 2017 Miky Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.serialized;





import java.io.FileOutputStream;
import java.io.ObjectOutputStream;





/**
 *
 * @author Miky Mikusher
 */
public class Serializar {

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        Empregado emp = new Empregado();
        emp.setNome("Luis Tavares");
        emp.setEndereco("Rua Nova Vida - Braga - Portugal");
        emp.setIdade(29);
        emp.setSsn(1112233344);
        emp.setNumero(032);

        try {
            FileOutputStream fileOut = new FileOutputStream("E:/ser/empregado.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Serializacao gravado com sucesso em: E:/ser/empregado.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
