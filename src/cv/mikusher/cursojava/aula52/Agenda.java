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
public class Agenda {

    private Contato[] contatos;





    public Agenda() {
        contatos = new Contato[5];
    }





    public void adicionarContato(Contato c) throws AgendaCheiaException {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;
            }
        }
        if (cheia) {
            throw new AgendaCheiaException();
        }
    }





    public int consultarContatoPorNome(String nome) throws ContatoNaoExistenteException {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome()
                               .equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        throw new ContatoNaoExistenteException(nome);
    }





    @Override
    public String toString() {

        String s = "";
        for (Contato contato : contatos) {
            if (contato != null) {
                s += contato.toString() + "\n";
            }
        }
        return s;
    }
}