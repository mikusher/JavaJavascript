/*
 * Copyright (C) 2017 latavares - 16/12/2017
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

// Link Jar: https://search.maven.org/remotecontent?filepath=redis/clients/jedis/2.9.0/jedis-2.9.0.jar

package cv.tools;

import redis.clients.jedis.Jedis;

public class RedisJava {

	public static void main(String[] args) {

		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		// check whether server is running or not
		System.out.println("Server is running: " + jedis.ping());
		jedis.close();
	}
}