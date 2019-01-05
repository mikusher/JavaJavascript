/*
 * Copyright (C) 2017 Luis Tavares
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */

package cv.bockdamm.connsecurity;

/**
 *
 * @author Luis Amilcar Tavares
 */
public interface Queryoperation extends Constantesql {

  /**
   * Operation Users
   */
  String queryusers = "SELECT users_name, users_password FROM users_login;";

  /**
   * Operation Postgres - Select
   */
  String psqlSelectData = "SELECT sexo,idade,filhos,gasta_muito FROM vendas";

}
