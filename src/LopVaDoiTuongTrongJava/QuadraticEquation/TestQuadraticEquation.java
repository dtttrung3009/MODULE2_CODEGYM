package LopVaDoiTuongTrongJava.QuadraticEquation;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation text1= new QuadraticEquation(1,2,3);
        QuadraticEquation text2= new QuadraticEquation(1,3,1);
        QuadraticEquation text3= new QuadraticEquation(1,2,1);
        Display(text1);
        Display(text2);
        Display(text3);
    }
    public static void Display(QuadraticEquation text){
        if(text.getDiscriminant()>0){
            System.out.println("Có 2 nghiệm là "+text.getRoot1()+" và "+text.getRoot2());
        }else{
            if(text.getDiscriminant()<0){
                System.out.println("Phương trình vô nghiệm!!!");
            }else{
                System.out.println("Phương tình có nghiệm kép: "+text.getRoot2());
            }
        }
    }
}
