package NgonNguLapTrinhJava;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number= ");
        int number=scanner.nextInt();

        if(number<2){
            System.out.println(number+" không phải là số nguyên tố");
        }else{
            boolean check=true;
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    check=false;
                    break;
                }
            }
            if(check) System.out.println(number+" là số nguyên tố");
            else System.out.println(number+" không phải là số nguyên tố");
        }
    }
}
