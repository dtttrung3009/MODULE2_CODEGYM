package advanced_object.colorable;

public class Square extends Rectangle implements Colorable{


    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square with side "+getSide()+" with area "+getArea();
    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
