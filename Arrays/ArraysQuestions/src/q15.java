import java.util.ArrayList;
import java.util.Arrays;

public class q15 {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        oddeven(arr);

    }

    public static void oddeven(int [] arr){
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }


}
