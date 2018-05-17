/*
 * Copyright (C) 2017 Miky Mikusher

 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */

package cv.mikusher.analise;

public class Correlation {
  static String argValue[];
  static int    nrows, ncols, img[][], type;
  static double  size, arr1[][], arr2[][];
  static final int LC=0, NC=1, CC=2;

  public static void main(String[] args) {
    int      i, j;
    double   corr=0, mean1=0, mean2=0, mag1=0, mag2=0;

    readInput(args.length, args);

    if (type == LC) {    // Linear correlation
      for (i=0; i<nrows; i++)
        for (j=0; j<ncols; j++)
          corr += arr1[i][j] * arr2[i][j];
      corr /= size;
    }else if (type == NC) {    // Normalized correlation
      for (i=0; i<nrows; i++)
        for (j=0; j<ncols; j++) {
          mag1 += arr1[i][j] * arr1[i][j];
          mag2 += arr2[i][j] * arr2[i][j];
          corr += arr1[i][j] * arr2[i][j];
        }
      corr /= Math.sqrt(mag1*mag2);

    }else{    // Correlation Coefficient
      for (i=0; i<nrows; i++) {   // Compute mean
        for (j=0; j<ncols; j++) {
          mean1 += arr1[i][j];
          mean2 += arr2[i][j];
        }
      }
      mean1 /= size;
      mean2 /= size;

      for (i=0; i<nrows; i++) {
        for (j=0; j<ncols; j++) {
          arr1[i][j] -= mean1;
          arr2[i][j] -= mean2;
          mag1 += arr1[i][j] * arr1[i][j];
          mag2 += arr2[i][j] * arr2[i][j];
          corr += arr1[i][j] * arr2[i][j];
          }
      }
      corr /= Math.sqrt(mag1*mag2);
    }
    System.out.println("Result of correlation = " + corr);
  }


  public static void readInput(int length, String args[]) {
    int  i, j;

    argValue = args;
    if (length != 7 || wrongArg()) {
      System.out.print(
        "Usage: Correlation <nrows> <ncols> -<lc/nc/cc> -<f/i> <arr1> -<f/i> <arr2>\n");
      System.out.print(
        "  lc: linear correlation\n  nc: normalized correlation\n  cc: correlation coefficient\n");
      System.out.print("  f : double array\n  i : image array\n");
      System.exit(0);
    }

    nrows = Integer.parseInt(argValue[0]);
    ncols = Integer.parseInt(argValue[1]);
    arr1 = new double[nrows][ncols];
    arr2 = new double[nrows][ncols];
    img = new int[nrows][ncols];
    size = nrows * ncols;

    if (argValue[3].equals("-i")) {    // An image
      ArrayIO.readByteArray(argValue[4], img, nrows, ncols);
      for (i=0; i<nrows; i++)
        for (j=0; j<ncols; j++)
          arr1[i][j] = img[i][j];
    }else   // A double array
      ArrayIO.readDoubleArray(argValue[4], arr1, nrows, ncols);

    if (argValue[5].equals("-i")) {    // An image
      ArrayIO.readByteArray(args[6], img, nrows, ncols);
      for (i=0; i<nrows; i++)
        for (j=0; j<ncols; j++)
          arr2[i][j] = img[i][j];
    }else   // A double array
      ArrayIO.readDoubleArray(args[6], arr2, nrows, ncols);

    if (argValue[2].equals("-lc"))
      type = LC;     // Linear correlation
    else if (argValue[2].equals("-nc"))
      type = NC;     // Normalized correlation
    else
      type = CC;     // Correlation coefficient
  }


  public static boolean wrongArg() {
    if (!argValue[2].equals("-lc") &&
        !argValue[2].equals("-nc") &&
        !argValue[2].equals("-cc"))
      return true;
    if (!argValue[3].equals("-f") && !argValue[3].equals("-i"))
      return true;
    if (!argValue[5].equals("-f") && !argValue[5].equals("-i"))
      return true;
    return false;
  }

}