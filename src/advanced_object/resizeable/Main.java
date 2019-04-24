package advanced_object.resizeable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[3];
        shapes[0]= new Circle("black",true,4.4);
        shapes[1]= new Square(5.1);
        shapes[2]= new Rectangle("yellow", true,4.5,8.8);
        Random rd= new Random();
        System.out.println("Before change");
        for (Shape shape: shapes){
            System.out.println(shape);

        }
        System.out.println("After change");
        for (Shape shape: shapes){
            Resizeable r= (Resizeable) shape;
            r.resizeArea(rd.nextInt(101));
            System.out.println(shape);
        }
    }
}
