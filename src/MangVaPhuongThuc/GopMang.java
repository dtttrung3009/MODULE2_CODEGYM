package MangVaPhuongThuc;

public class GopMang {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int []arr2= {6,9,7};
        int [] arr3= new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int j=0;
        for(int i=arr1.length;i<arr3.length;i++){
            arr3[i]=arr2[j];
            j++;
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]+"\t");
        }
    }
}
