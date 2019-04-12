package NgonNguLapTrinhJava;
public class InHinhHoc {
    public static void main(String[] args) {
        System.out.println("In hình chữ nhật:");
        HCN();
        System.out.println("\nIn hình tam giác");
        TamGiac();
    }
    public static void HCN(){
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void TamGiac(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println("");
        }

    }


}
