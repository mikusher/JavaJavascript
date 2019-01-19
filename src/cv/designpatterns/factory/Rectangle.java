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
public class Rectangle implements Shape {

    /*
     * (non-Javadoc)
     * @see cv.designpatterns.factory.Shape#draw()
     */
    @Override
    public void draw() {

        System.out.println("Inside Rectangle::draw() method");

    }

}
