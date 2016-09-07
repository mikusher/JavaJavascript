/*
 * Copyright (C) 2016 Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */

package cv.mikusher.outros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Mikusher
 */
public class ReadWebPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        BufferedReader br = null;
        
        try {
            URL url = new URL("http://www.hotmail.com");
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String line;
            StringBuilder sb = new StringBuilder();
            
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            System.out.println(sb);
        
        } finally {
            if (br != null){
                br.close();
            }        
        }
    }
}
