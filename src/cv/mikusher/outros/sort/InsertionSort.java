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
import java.util.Arrays;

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class InsertionSort {
    
    public static int[] doInsertionSort(int[] input){
         int temp;
         for (int i = 1; i < input.length; i++) {
             for(int j = i ; j > 0 ; j--){
                 if(input[j] < input[j-1]){
                     temp = input[j];
                     input[j] = input[j-1];
                     input[j-1] = temp;
                 }
             }
         }
         return input;
    }
    
    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(Arrays.toString(arr1));
            System.out.print(i+", ");
        }
    }
}