package MangVaPhuongThuc;

import java.util.Scanner;

public class XoaPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int []arr= new int[10];
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n= scanner.nextInt();
        Nhap(arr,n);
        Xuat(arr,n);
        System.out.println("Nhập vị trí cần xóa: ");
        int position=scanner.nextInt();
        System.out.println("Mảng sau khi xóa là:");
        delete(arr,n,position);
        Xuat(arr,n-1);
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
    public static void delete(int arr[], int n, int position){
        for(int i=position-1;i<=n-1;i++){
            arr[i]=arr[i+1];
        }
    }
}
