/*
 * Copyright (C) 2017 latavares - 03/10/2017
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





package cv.mikusher.diversidade;





import java.util.ArrayList;





public class Teste {

    public static void main(String[] args) {

        ArrayList<Personalidade> personal = new ArrayList<>(10);
        Personalidade pessoa = new Personalidade("Luis", "Amilcar", "Rua rua nova", "2542251", 29);
        Personalidade pessoa2 = new Personalidade("Miky", "Mikusher", "Rua rua nova", "2542251", 29);
        pessoa.setValor(1000);
        pessoa2.setValor(1000);
        personal.add(pessoa);
        personal.add(pessoa2);

        System.out.println(personal.contains(pessoa));
    }

}
