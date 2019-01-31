/*
 * Copyright (C) 2019 Miky Mikusher - 24/01/2019
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package cv.mikusher.wekaControler.latavares;

public enum QueryConstants {
  USER_DB("postgres"), PASS_DB("mikusher"), QUERY_DB_SELECT(
      "SELECT sexo,idade,filhos,gasta_muito FROM vendas"), QUERY_DB_INSERT_NEW_ELEMENT(
          "INSERT INTO vendas (sexo, idade, filhos, gasta_muito) VALUES(?, ?, ?, ?)"), QUERY_DB_INSERT(
              "INSERT INTO sales_results(\"yes\", \"no\", sexo, idade, filhos, estado) VALUES(?, ?, ?, ?, ?, ?)");

  private final String text;

  QueryConstants(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }

  public static QueryConstants fromString(String text) {
    for (QueryConstants b : QueryConstants.values()) {
      if (b.text.equalsIgnoreCase(text)) {
        return b;
      }
    }
    return null;
  }
}
