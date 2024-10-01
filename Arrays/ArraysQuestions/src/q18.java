import java.util.Arrays;

public class q18 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 8, 7};
        int k = 3;
        System.out.println("The " + k + "rd smallest element is " + kthSmallest(arr, k));
    }


    public static int kthSmallest(int[] arr, int k) {

        Arrays.sort(arr);


        return arr[k - 1];
    }
}
