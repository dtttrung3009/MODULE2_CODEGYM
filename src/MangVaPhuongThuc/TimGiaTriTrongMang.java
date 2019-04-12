package MangVaPhuongThuc;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] name = {"Trường", "Đại", "Quang", "Văn", "Trung", "Tú", "Sang"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tên của vị trí cần tìm trong mảng: ");
        String NameSearch=scanner.next();
        search(name,NameSearch);
    }
    public static void search(String [] name, String nameSearch){
        boolean exist=false;
        for(int i=1;i<name.length;i++){
            if(name[i].equals(nameSearch)){
                System.out.println("Vị trí của "+name[i] +" trong mảng là "+(i+1));
                exist= true;
                break;
            }
        }
        if(exist==false) System.out.println("Không có trong mảng!!!");
    }
}

