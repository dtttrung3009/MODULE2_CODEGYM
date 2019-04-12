package NgonNguLapTrinhJava;

import java.util.Scanner;

public class ThietKeMenuUngDung {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       int choice=-1;
        while(choice!=4){
            System.out.println("\t\t MENU");
            System.out.println("1.Vẽ tam giác");
            System.out.println("2.Vẽ hình vuông");
            System.out.println("3.Vẽ hình chữ nhật");
            System.out.println("4.Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
             choice=scanner.nextInt();
            switch (choice){
                case 1: TamGiac();break;
                case 2: HinhVuong();break;
                case 3: HinhCN();break;
                case 4: System.exit(4);
                default:
                    System.out.println("Lựa chọn bạn nhập không hợp lí!!!");
            }

        }
    }

    public static void TamGiac() {
        System.out.println("Tam giác");
        System.out.println("******");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
    public static void HinhVuong(){
        System.out.println("Hình vuông");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
    }
    public static void HinhCN(){
        System.out.println("Hình chữ nhật");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
    }
}
