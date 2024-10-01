import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class q5 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 2, 6, 4, 8, 10, 3};
        Dup(nums);
    }

    public static void Dup(int [] nums){

        List<Integer> a=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){


            }
            else{
                a.add(nums[i]);
            }
        }
        System.out.println(a);
    }
}
