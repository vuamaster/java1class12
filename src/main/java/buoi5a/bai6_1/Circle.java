package buoi5a.bai6_1;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString()+
                "radius=" + radius +
                ']';
    }
}
