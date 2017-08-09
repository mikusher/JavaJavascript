/**
 * Copyright (C) 2017, Luis Tavares - 08/08/2017
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





package cv.mikusher.outros;





import java.util.Date;





/**
 * @description:
 * 
 */

public class Clock extends Thread {

    @Override
    public void run() {

        while (true) {
            Date da = new Date();
            String time = da.getHours() + ":" + da.getMinutes() + ":" + da.getSeconds();
            String date = da.getDate() + "/" + da.getMonth() + "/" + (da.getYear() + 1900);
            System.out.println(time + " - " + date);
            try {
                sleep(1000);
            } catch (Exception ex) {
            }
        }
    }





    public static void main(String... s) {

        Clock cl = new Clock();
        cl.run();
    }

}
