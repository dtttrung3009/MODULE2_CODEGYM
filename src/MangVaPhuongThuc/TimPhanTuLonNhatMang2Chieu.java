package MangVaPhuongThuc;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int arr[][]= new int[10][10];
        int n;
        System.out.println("Nhập vào bậc của ma trận: ");
        n=scanner.nextInt();
        Nhap(arr,n);
        Xuat(arr,n);
        EarnValueMax(arr,n);
        //test change
        //đẩy oleen git
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
    public static void EarnValueMax(int arr[][], int n){
        int max=arr[0][0];
        int xMax=0,yMax=0;
        for(int row=0;row<n;row++){
            for(int colum=0;colum<n;colum++){
                if(arr[row][colum]>max){
                    max=arr[row][colum];
                    xMax=row;
                    yMax=colum;
                }
            }
        }
        System.out.println("Giá trị max là arr["+xMax+"]["+yMax+"]= "+arr[xMax][yMax]);
    }
}
