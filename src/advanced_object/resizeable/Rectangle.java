package advanced_object.resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width =1.0, length=1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter(){
        double perimeter= (getWidth()+getLength())*2;
        return perimeter;
    }
    public double getArea(){
        double area= getWidth()*getLength();
        return area;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "}";
    }

    @Override
    public void resizeArea(double percent) {
        this.width=this.width*percent/100;
        this.length= this. length*percent/100;
        System.out.println(getArea()*percent/100);
    }
}
