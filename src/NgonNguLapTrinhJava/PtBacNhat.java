package NgonNguLapTrinhJava;

import java.util.Scanner;

public class PtBacNhat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Giải pt bậc nhất: ");
        System.out.println("PT bậc nhất có dạng ax+b=0");
        double a,b,x;
        System.out.println("Nhập a= ");
        a=12.3;
        a= scanner.nextDouble();
        System.out.println("Nhập b= ");
        b= scanner.nextDouble();
        if(a!=0){
            x=(-b)/a;
            System.out.println("Nghiệm của pt là: "+x);
        }else{
            if(b==0){
                System.out.println("pt có vô số nghiệm");
            }else{
                System.out.println("Vô nghiệm");
            }
        }
    }
}
