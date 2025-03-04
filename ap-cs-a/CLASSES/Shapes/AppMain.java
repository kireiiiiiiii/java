import Shapes.*;

public class AppMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 10);
        Triangle t = new Triangle(2, 5, 4);
        
        Shape[] shapes = { c, r, t };
        for (Shape s : shapes) {
            printShape(s);
            System.out.println();
        }
    }

    public static void printShape(Shape shape) {
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}