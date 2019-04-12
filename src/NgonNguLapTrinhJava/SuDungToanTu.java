package NgonNguLapTrinhJava;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float width, height;
        System.out.println("Nhap chieu rong: ");
        width=scanner.nextFloat();
        System.out.println("Nhap chieu dai: ");
        height=scanner.nextFloat();
        float area=width*height;
        System.out.println("Area is: "+area);
    }
}
