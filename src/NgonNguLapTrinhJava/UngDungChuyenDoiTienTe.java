package NgonNguLapTrinhJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền USD cần chuyển đổi: ");
        Scanner scanner= new Scanner(System.in);
        double USD=scanner.nextDouble();
        System.out.println("Số tiền khi chuyển sang VND là "+convert(USD));
    }
    public static double convert(double USD){
        return  USD*20000;
    }

}
