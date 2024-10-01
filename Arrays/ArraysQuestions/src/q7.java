import java.util.Arrays;

public class q7 {
    public static void main(String[] args) {
        int [] arr={3,7,1,9,5};
        int [] arr2={0,0,0,0,0};
        System.out.println(Arrays.toString(SUm(arr,arr2)));
    }

    public static int[] SUm(int [] arr,int[] arr2){

        for (int i=0;i< arr.length;i++){
           arr2[i]=arr[i];
        }
        return arr2;
    }
}
