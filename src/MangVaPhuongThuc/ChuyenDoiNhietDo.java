package MangVaPhuongThuc;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static double C_To_F(double C){
        return ((9.0)/5*C+32);
    }
    public static double F_To_C(double F){
        return ((5.0/9)*(F-32));
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int choice=-1;
        while(choice!=3){
            System.out.println("MENU");
            System.out.println("1.Chuyển từ độ C sang độ F:");
            System.out.println("2.Chuyển từ độ F sang độ C:");
            System.out.println("3.Thoát");
            System.out.println("Vui lòng chọn");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                {
                    System.out.println("Nhập vào độ C: ");
                    double C=scanner.nextDouble();
                    System.out.println("Chuyển qua độ F là "+C_To_F(C));
                    break;
                }
                case 2:
                {
                    System.out.println("Nhập vào độ F: ");
                    double F=scanner.nextDouble();
                    System.out.println("Chuyển qua độ C là "+F_To_C(F));
                    break;
                }
                case 3:System.exit(3);
            }

        }
    }
}
