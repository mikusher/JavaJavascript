/*
 * Copyright (C) 2017 Miky Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.agenda;





import java.io.Serializable;
import java.util.UUID;





/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class Pessoa implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String            _nome, _endereco, _genero;
    private int               _idade;
    private transient int     _id;
    private String            _randomUUIDString;





    Pessoa() {}





    Pessoa(int id, String nome, int idade, String genero) {

        this._id = id;
        this._nome = nome;
        this._idade = idade;
        this._genero = genero;

    }





    public String setUUID(UUID uuid_) {

        this._randomUUIDString = UUID.randomUUID()
                                     .toString();
        _randomUUIDString.replaceAll("-", "");

        return _randomUUIDString;
    }





    public String getUUID() {

        return _randomUUIDString;
    }





    Pessoa(String nome, int idade, String genero) {

        this._nome = nome;
        this._idade = idade;
        this._genero = genero;

    }





    public String toString() {

        return "Nome= " + _nome + "\nGenero= " + _genero + "\nIdade= " + _idade;
    }





    public String getNome() {

        return _nome;
    }





    public void setNome(String nome) {

        this._nome = nome;
    }





    public int getIdade() {

        return _idade;
    }





    public void setIdade(int idade) {

        this._idade = idade;
    }





    public String getEndereco() {

        return _endereco;
    }





    public void setEndereco(String endereco) {

        this._endereco = endereco;
    }





    public int getId() {

        return _id;
    }





    public void setId(int id) {

        this._id = id;
    }

}
