package Shapes;

public class Circle implements Shape {
    
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radious, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radious;
    }

}
