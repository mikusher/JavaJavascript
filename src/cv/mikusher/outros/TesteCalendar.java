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





import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;





/**
 * @description:
 * 
 */

public class TesteCalendar {

    /**
     * @param args
     * @throws UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException {

        // TODO Auto-generated method stub
        int segundo, minuto, hora, dia, mes, ano;
        GregorianCalendar data = new GregorianCalendar();

        InetAddress ip_ = InetAddress.getLocalHost();

        segundo = data.get(GregorianCalendar.SECOND);
        minuto = data.get(GregorianCalendar.MINUTE);
        hora = data.get(GregorianCalendar.HOUR_OF_DAY);
        dia = data.get(GregorianCalendar.DAY_OF_MONTH);
        mes = data.get(GregorianCalendar.MONTH);
        ano = data.get(GregorianCalendar.YEAR);

        System.out.println("Tempo do momento: " + hora + ":" + minuto + ":" + segundo + " - " + dia + "/" + mes + "/" + ano + "");
        System.out.println(ip_);

    }

}
