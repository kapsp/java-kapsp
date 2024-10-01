import java.util.HashSet;
import java.util.Set;

public class q20{
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 5, 8};
        int[] arr2 = {5, 2, 9};

        Set<Integer> result = findIntersection(arr1, arr2);
        System.out.println("The intersection of arrays: " + result);
    }

    public static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add all elements of the first array to set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Check if elements of the second array exist in set1, add to intersection
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection;
    }
}
