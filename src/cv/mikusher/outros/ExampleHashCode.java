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

import java.util.*;

/**
 *
 * @author Mikusher
 */
public class ExampleHashCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i = new Integer(50);
        Long l = new Long(50);
        Float f = new Float(50);
        Integer i2 = new Integer(0);

        // hash codes of different objects with same value are always same
        System.out.println("Hash code of " + i + " is =  " + i.hashCode());
        System.out.println("Hash code of " + l + " is =  " + l.hashCode());

        // hash code for float value i.e different from Integer and Long
        System.out.println("Hash code of " + f + " is =  " + f.hashCode());

        // hash code value of number zero(0) is zero(0)
        System.out.println("Hash code of " + i2 + " is = " + i2.hashCode());

        String str = "miky mikusher r. wayne";

        // hash code of string str
        System.out.println("Hash code of string '" + str + "' is = " + str.hashCode());
    }
}
