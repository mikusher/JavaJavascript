/*
 * Copyright (C) 2016 Miky Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */

package cv.mikusher.outros.sort;

import java.util.Random;

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class GenerateRandom {
    
    public static void main(String[] args) {
        int[] ar1 = new int[10];
        for(int i = 0; i < ar1.length; i++) {
            ar1[i] = (int)(Math.random() * 100);
            System.out.print(ar1[i] + "  ");
        }
    }
}
