import java.util.HashSet;
import java.util.Set;

public class q19 {
    public static void main(String[] args) {
        int[]k={3, 2, 5, 2, 8, 5};
        System.out.println(duplicates(k));
    }

    public static Set<Integer> duplicates(int[] arr){
        Set<Integer> a=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(a.contains(arr[i])){

            }else {
                a.add(arr[i]);
            }
        }
        return a;
    }
}
