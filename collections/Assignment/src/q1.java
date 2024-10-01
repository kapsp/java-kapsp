import java.util.HashMap;
import java.util.Map;

public class q1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 3, 4, 5};
        System.out.println(    countd(nums));

    }

    public static Map countd(int [] nums){
        Map <Integer,Integer> a=new HashMap<>();


        for(int i=0;i<nums.length;i++)
        {
            int count=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j&&nums[i]==nums[j]){
                    count++;

                }
            }
            a.put(nums[i],count);
        }
        return a;
    }
}
