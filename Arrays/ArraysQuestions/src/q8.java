import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int [] arr={3,7,1,9,5};

        System.out.println(SUm(arr));
    }

    public static int SUm(int [] arr){
        int sum=0;

        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
