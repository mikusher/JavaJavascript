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





import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;





public class Teste2 {

    public static void main(String[] args) {

        HashMap<Integer, Personalidade> maps = new HashMap<>();
        Personalidade p1 = new Personalidade("Luis", "Amilcar", "Rua rua nova", "2542251", 29);
        Personalidade p2 = new Personalidade("Miky", "Mikusher", "Rua rua nova", "2542251", 28);

        maps.put(p1.getIdade(), p1);
        maps.put(p2.getIdade(), p2);

        Iterator<?> itr = maps.entrySet()
                              .iterator();
        while (itr.hasNext()) {
            Map.Entry map = (Map.Entry) itr.next();

            if (map == null) {
                System.out.println("Map vazio");
            } else {
                System.out.println("Chave: " + map.getKey() + " Valor: " + map.getValue());
            }

        }
    }

}
