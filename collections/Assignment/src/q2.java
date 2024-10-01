import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class q2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 3, 4, 5};
        Dup(nums);
    }

    public static void Dup(int [] nums){

        List<Integer> a=new ArrayList<>();
        Set<Integer> b=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){

                b.add(nums[i]);
            }
            else{
                a.add(nums[i]);
            }
        }
        System.out.println(b);
    }
}
