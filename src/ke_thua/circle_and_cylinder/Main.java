package ke_thua.circle_and_cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\tCLASS CIRCLE");
        Circle circle= new Circle("blue",6.2);
        System.out.println(circle.toString()+" with area= "+circle.getArea());
        System.out.println("\t\t\tCLASS CYLINDER");
        Cylinder cylinder= new Cylinder("yellow",7.4,5.2);
        System.out.println(cylinder.toString() +" with volume "+cylinder.getArea());
    }
}
