package advanced_object.resizeable;

public class Circle extends Shape implements Resizeable{
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
                "}";
    }


    @Override
    public void resizeArea(double percent) {
        this.radius=this.radius*percent/100;
        System.out.println(getArea());
    }
}
