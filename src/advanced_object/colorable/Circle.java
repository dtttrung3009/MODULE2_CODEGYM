package advanced_object.colorable;

public class Circle extends Shape {
    private double radius=1.0;
    final double PI=3.14;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        double area= PI*Math.pow(getRadius(),2);
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                "}with area "+getArea();
    }


}
