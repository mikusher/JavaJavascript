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

/**
 *
 * @author Miky Mikusher
 */
public class Empregado implements java.io.Serializable{
    private String nome;
    private String endereco;
    private int idade;
    private transient int ssn; //esse valor por utilizar o transient não será serializado.
    private int numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void vereficaEmail(){
        System.out.println("Email verificado para o " +nome+ " "+endereco);
    }
    
}
