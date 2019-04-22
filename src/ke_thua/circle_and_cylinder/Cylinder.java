package ke_thua.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height=1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} with "+super.toString();
    }
}
