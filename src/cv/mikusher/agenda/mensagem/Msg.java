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

    // postgres operation
    public static final String P_USER_DRIVE                      = "O Drive usado \u00e9{0}";
    public static final String P_DATA_BASE_CREATE_SUCCESS        = "Base de dados {0} criado com sucesso.";
    public static final String P_TABLE_CREATE_SUCCESS            = "Tabela {0} criado na base de dados ";
    public static final String P_LINE_INSERT_SUCCESS             = "Linha inserida com sucesso!";
    public static final String P_LINE_DELETE_SUCCESS             = "Linha apagado com sucesso.";
    public static final String P_LINE_UPDATE_SUCCESS             = "Linha atualizado com sucesso.";
    public static final String P_NEWUSER_LOGIN_CREATE_SUCCESS    = "Novo utilizaror de Login criado com sucesso.";

}
