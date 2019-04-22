package ke_thua.he_cac_doi_tuong_hinh_hoc;

public class Rectangle extends Shape {
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
     public double getArea(){
        double area= getWidth()*getLength();
        return area;
     }
    public double getPerimeter(){
        double perimeter= (getWidth()+getLength())*2;
        return perimeter;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "} with is a subclass of "+super.toString();
    }
}
