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

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class OpenCloseBrowser {
    
    public static void main(String[] args) {
        int i = 0;
        while (true && i < 3) {
                try {
                Process prs = Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe \"http://www.google.com\"");
                Thread.sleep(5000);
                prs.destroy();
                i = i + 1;
                    System.out.println("Abriu e fechou " + i + " vez");
            } catch (Exception e) {
            }
            
        }
        
    }

}
