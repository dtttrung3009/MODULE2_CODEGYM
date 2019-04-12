package NgonNguLapTrinhJava;

import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Tìm ước số chung lớn nhất của 2 số a và b: ");
        System.out.println("Nhập a: ");
        int a=scanner.nextInt();
        System.out.println("Nhập b: ");
        int b=scanner.nextInt();
        a= Math.abs(a);
        b= Math.abs(b);
        System.out.println("Ước chung lớn nhất của a và b là: "+UCLN(a,b));
    }

    public static int  UCLN(int a, int b) {
        while(a!=b){
            if(a>b)
            {a=a-b;}
            else
                { b=b-a;}
        }
        return a;
    }
}
