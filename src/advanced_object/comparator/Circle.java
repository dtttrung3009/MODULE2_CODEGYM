package advanced_object.comparator;

public class Circle extends Shape{
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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area= PI*Math.pow(getRadius(),2);
        return area;
    }
    public double getPerimeter(){
        double perimeter= PI*2*getRadius();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                "} with is a subclass of "+super.toString() ;
    }

}
