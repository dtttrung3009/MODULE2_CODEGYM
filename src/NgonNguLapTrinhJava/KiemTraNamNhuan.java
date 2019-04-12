package NgonNguLapTrinhJava;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter year: ");
        int year= scanner.nextInt();
        check(year);
    }
    public static void check(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" là năm nhuận!");
                }
                else{
                    System.out.println(year+" không phải năm nhuận!");
                }
            }else{
                System.out.println(year+" là năm nhuận!");
            }
        }else{
            System.out.println(year+" không phải năm nhuận!");
        }
    }
}
