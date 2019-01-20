/*
 * Copyright (C) 2019 Miky Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.designpatterns.factory;





/**
 * @author Miky Mikusher
 *
 */
public class ColorFactory extends AbstractFactory {

    /*
     * (non-Javadoc)
     * @see cv.designpatterns.factory.AbstractFactory#getColor(java.lang.String)
     */
    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }





    /*
     * (non-Javadoc)
     * @see cv.designpatterns.factory.AbstractFactory#getShape(java.lang.String)
     */
    @Override
    Shape getShape(String shape) {

        // TODO Auto-generated method stub
        return null;
    }

}
