package advanced_object.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circles= new Circle[3];
        circles[0]=new Circle(2.5);
        circles[1]= new Circle();
        circles[2]= new Circle("yellow",true,5.3);
        System.out.println("Pre-sorted");
        for(Circle circle: circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
