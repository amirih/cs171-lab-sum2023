package cs171.sum2023.lab2;

import cs171.sum2023.lab1.Circle;
import cs171.sum2023.lab1.Rectangle;

public class ShapeTester {
    public ShapeTester() {

    }

//    public static void compareShapes( Rectangle rectangle, Circle circle){
//        if(rectangle.getY() == circle.getY() && rectangle.getX() == circle.getX()) {
//            System.out.println("The center is the same");
//        }
//    }

    public static boolean compareShapes(Rectangle rectangle, Circle circle){
//        return rectangle.getY() == circle.getY() && rectangle.getX() == circle.getX();
        if(rectangle.getY() == circle.getY() && rectangle.getX() == circle.getX()){
            return true;
        }
        else {
            return false;
        }
    }

    public static void compareArea(Rectangle rectangle, Circle circle){
        if(rectangle.getArea() > circle.getArea()) {
            System.out.println("The rectangle has a larger area");
        } else if (rectangle.getArea() < circle.getArea()) {
            System.out.println("The circle has a larger area");
        } else {
            System.out.println("The rectangle and circle have the same area");
        }

    }

}
