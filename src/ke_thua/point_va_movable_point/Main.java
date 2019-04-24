package ke_thua.point_va_movable_point;

public class Main {
    public static void main(String[] args) {
        //Point
        Point point= new Point(2.3f,4.5f);
        System.out.println("Before movable");
        System.out.println(point);
        //Moveable
        System.out.println("Movable");
        MovablePoint movablePoint= new MovablePoint(0.5f,2.1f);
        System.out.println(movablePoint);
        //after
        System.out.println("After movable");
        movablePoint.move(point);
        System.out.println(point);
    }
}
