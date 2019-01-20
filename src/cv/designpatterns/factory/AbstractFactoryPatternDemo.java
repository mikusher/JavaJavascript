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
public class AbstractFactoryPatternDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.geFactory("SHAPE");

        Shape shape_i = shapeFactory.getShape("CIRCLE");
        shape_i.draw();

        Shape shape_ii = shapeFactory.getShape("RECTANGLE");
        shape_ii.draw();

        Shape shape_iii = shapeFactory.getShape("SQUARE");
        shape_iii.draw();

        AbstractFactory colorFactory = FactoryProducer.geFactory("COLOR");
        Color color_i = colorFactory.getColor("RED");
        color_i.fill();

        Color color_ii = colorFactory.getColor("GREEN");
        color_ii.fill();

        Color color_iii = colorFactory.getColor("BLUE");
        color_iii.fill();

    }

}
