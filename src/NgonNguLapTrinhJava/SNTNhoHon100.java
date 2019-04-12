package NgonNguLapTrinhJava;

public class SNTNhoHon100 {
    public static void main(String[] args) {
        System.out.println("HIỂN THỊ CÁC SNT NHỎ HƠN 100:");
        for(int k=1;k<=100;k++){
            if(SNT(k)) System.out.print("\t"+k+"\t");
        }
    }

    public static boolean SNT(int n) {
        boolean check=true;
        if(n<2) {
            check=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    check=false;
                    break;
                }
            }
        }
        return check;
    }
}
