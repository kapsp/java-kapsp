import java.util.Arrays;

public class q14 {
    public static void main(String[] args) {
        int[] arr={3, 7, 1, 9, 5};
        System.out.println(findTopTwoScores(arr));

    }

    public static int findTopTwoScores(int[] array) {
        int firstbiggest = Integer.MIN_VALUE;
        int secondbiggest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstbiggest) {
                secondbiggest = firstbiggest;
                firstbiggest = array[i];
            } else if (array[i] > secondbiggest && array[i] < firstbiggest) {
                secondbiggest = array[i];
            }
        }
        return  secondbiggest;
    }
}
