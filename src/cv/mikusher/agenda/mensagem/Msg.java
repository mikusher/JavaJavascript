/*
 * Copyright (C) 2018 Luis Tavares
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.agenda.mensagem;

/**
 *
 * @author Luis Tavares
 */
public interface Msg {
    public static final String C_LOGIN_CAMPOS_USR_PASS_VAZIO     = "Os campos de username e password nao pode ser vazio";
    public static final String C_LOGIN_TENTE_NOVAMENTE           = "Dados errado. Tente novamente";
    public static final String C_LOGIN_IMPOSSIVEL_ADICIONAR_USER = "Não é possivel adicionar utilizador.";
}
