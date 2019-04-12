package NgonNguLapTrinhJava;

public class HaiMuoiSNTDauTien {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là: ");
        int dem=0;
        int i=1;
        while(dem<20){
            if(SNT(i)){
                dem++;
                System.out.print("\t"+i+"\t");
            }
            i++;
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
