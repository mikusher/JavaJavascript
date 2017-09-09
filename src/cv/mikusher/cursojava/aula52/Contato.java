/*
 * Copyright (C) 2017 Luis Tavares
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.cursojava.aula52;





/**
 *
 * @author Luis Tavares
 */
public class Contato {

    private static int contador = 0;
    private int        id;
    private String     nome;
    private String     telefone;
    private String     email;





    public Contato() {
        contador++;
        id = contador;
    }





    public int getId() {

        return id;
    }





    public String getNome() {

        return nome;
    }





    public void setNome(String nome) {

        this.nome = nome;
    }





    public String getTelefone() {

        return telefone;
    }





    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }





    public String getEmail() {

        return email;
    }





    public void setEmail(String email) {

        this.email = email;
    }





    @Override
    public String toString() {

        String s = "";
        s += "Id: " + id;
        s += " - Nome: " + nome;
        s += " - Telefone: " + telefone;
        s += " - Email: " + email;
        return s;
    }

}
