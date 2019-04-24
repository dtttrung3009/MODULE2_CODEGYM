package advanced_object.colorable;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[4];
        shapes[0]= new Square(5);
        shapes[1]=new Circle("black",true,4.4);
        shapes[2]= new Rectangle("yellow", true,4.5,8.8);
        shapes[3]= new Square("yellow",true,5);
        for(Shape shape:shapes){
            System.out.println(shape);
            System.out.println("Area: "+shape.getArea());
            if(shape instanceof Square){
                Colorable colorable= (Square) shape;
                colorable.howToColor();
            }
        }
    }
}
