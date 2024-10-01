import java.util.HashSet;
import java.util.Set;

public class q21{
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 5, 8};
        int[] arr2 = {5, 7, 9};

        Set<Integer> result = findUnion(arr1, arr2);
        System.out.println("The union of arrays: " + result);
    }

    public static Set<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();

        // Add all elements of the first array to the set
        for (int num : arr1) {
            unionSet.add(num);
        }

        // Add all elements of the second array to the set
        for (int num : arr2) {
            unionSet.add(num);
        }

        return unionSet;
    }
}
