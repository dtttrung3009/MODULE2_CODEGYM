package MangVaPhuongThuc;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        System.out.println("Nhập vào một chuỗi: ");
        Scanner scanner= new Scanner(System.in);
        String str= scanner.nextLine();
        System.out.println("Nhập vào từ cần đếm trong chuỗi: ");
        char kiTu=scanner.next().charAt(0);
        System.out.println("Số lần xuất hiện của kí tự "+kiTu+" trong chuỗi là "+Count(str,kiTu));
    }
    public static int Count(String str, char kiTu){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==kiTu){
                count++;
            }
        }
        return count;
    }
}
