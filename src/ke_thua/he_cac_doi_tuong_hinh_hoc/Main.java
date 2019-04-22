package ke_thua.he_cac_doi_tuong_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle("black",true,4.4);
        System.out.println(circle);
        Rectangle rectangle= new Rectangle("yellow", true,4.5,8.8);
        System.out.println(rectangle);
        Square square= new Square(5.1);
        System.out.println(square);
    }
}
