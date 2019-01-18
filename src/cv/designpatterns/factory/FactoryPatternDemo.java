package cv.designpatterns.factory;

public class FactoryPatternDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape_i = shapeFactory.getShape("CIRCLE");
        shape_i.draw();

        Shape shape_ii = shapeFactory.getShape("RECTANGLE");
        shape_ii.draw();

        Shape shape_iii = shapeFactory.getShape("SQUARE");
        shape_iii.draw();
    }

}
