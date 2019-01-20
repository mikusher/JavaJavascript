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
public abstract class AbstractFactory {

    abstract Color getColor(String color);





    abstract Shape getShape(String shape);

}
