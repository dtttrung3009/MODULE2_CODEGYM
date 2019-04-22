package bai_tap_bo_sung;

import java.util.Random;

public class RandomTest {
//    public static void main(String[] args) {
//        Random random= new Random();
//        int count=0;
//        while(count<=50){
//            int num= random.nextInt(100);
//            if(num>=0&&num<=50){
//                System.out.print(num+"  ");
//                count++;
//            }
//        }
//    }
static int[] getSumAndSub(int a, int b)
{
    int[] ans = new int[2];
    ans[0] = b;
    ans[1] = a;
    // returning array of elements
    return ans;
}

    // Driver method
    public static void main(String[] args)
    {
        int[] ans = getSumAndSub(100, 50);
        System.out.println("Sum = " + ans[0]);
        System.out.println("Sub = " + ans[1]);
    }
}
