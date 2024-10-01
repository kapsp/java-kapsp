import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int [] arr={3,7,1,9,5};
        System.out.println(Arrays.toString(reversse(arr)));

    }

    public static int[] reversse(int [] arr){
        int temp;
        int start=0;
        int end=arr.length-1;
       while(start<end){
           temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
       return arr;
    }
}
