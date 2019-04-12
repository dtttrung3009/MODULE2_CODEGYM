package MangVaPhuongThuc;

import java.util.Scanner;

public class ThemMotPhanTuVaoMang {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n, position, value;
        int arr[]=new int[20];
        System.out.println("Nhâp vào số lượng phần tử của mảng: ");
        n=scanner.nextInt();
        Nhap(arr,n);
        Xuat(arr,n);
        System.out.println("Nhập vị trí cần thêm: ");
        position=scanner.nextInt();
        System.out.println("Nhập giá trị cần thêm: ");
        value=scanner.nextInt();
        Add(arr,n,position,value);
        Xuat(arr,n+1);
    }
    public static void Nhap(int arr[], int n){
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Nhập arr["+(i+1)+"]= ");
            arr[i]= scanner.nextInt();
        }
    }
    public static void Xuat(int arr[], int n){

        for(int i=0;i<n;i++){
            System.out.println("arr["+(i+1)+"]= "+arr[i]+"  ");

        }
    }
    public static void Add(int arr[], int n,int position, int value ){
        for(int i=n-1;i>=position-1;i--){
            arr[i+1]=arr[i];
        }
        arr[position-1]=value;
    }
}
