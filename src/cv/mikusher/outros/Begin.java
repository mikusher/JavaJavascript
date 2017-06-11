/*
 * Copyright (C) 2016 Miky Mikusher
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
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class Begin {
    
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);                
            }
            in.close();
        } catch (MalformedURLException me) {
            System.out.println(me);
        } catch (IOException ioe){
            System.out.println(ioe);        
        }
    }
}