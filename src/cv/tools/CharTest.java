/*
 * Copyright (C) 2019 Miky Mikusher - 04/02/2019
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

package cv.tools;

public class CharTest {

  private static String input = "Miky-Mikusher/Raymond?Wayne";

  public static void main(String[] args) {
    sanitize(input);
    System.out.println(input);

  }

  // remove bad character
  public static String sanitize(String input) {
    if (input != null && !input.equals("")) {
      input = input.replaceAll("([\\ud840\\udbff\\udc00\\udfff\\ud800])", "");
    }
    return input;
  }

}
