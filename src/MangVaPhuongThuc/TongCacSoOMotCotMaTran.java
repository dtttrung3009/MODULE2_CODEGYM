package MangVaPhuongThuc;

import java.util.Scanner;

public class TongCacSoOMotCotMaTran {
    public static void main(String[] Trung) {
        Scanner scanner= new Scanner(System.in);
        int arr[][]= new int[10][10];
        int n;
        System.out.println("Nhập vào bậc của ma trận: ");
        n=scanner.nextInt();
        Nhap(arr,n);
        Xuat(arr,n);
        System.out.println("Nhập vào cột cần tính tổng : ");
        int colum=scanner.nextInt();
        System.out.println("Tổng của các phần tử cột "+colum+" = "+TinhTong(arr,n,colum-1));
    }
    public static void Nhap(int arr[][], int n){
        Scanner scanner= new Scanner(System.in);
        for(int row=0;row<n;row++){
            for(int colum=0;colum<n;colum++){
                System.out.println("Nhập arr["+row+"]["+colum+"]= ");
                arr[row][colum]=scanner.nextInt();
            }
        }
    }
    public static void Xuat(int arr[][], int n){
        for(int row=0;row<n;row++){
            for(int colum=0;colum<n;colum++){
                System.out.print(arr[row][colum]+"  ");
            }
            System.out.println("");
        }
    }
    public static int TinhTong(int arr[][], int n, int vtCot){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i][vtCot];
        }
        return sum;
    }
}
