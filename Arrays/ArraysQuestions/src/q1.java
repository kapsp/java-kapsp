import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,1,4,5,5};
        frequency(arr);

    }

    public static void frequency(int[] arr){

        int count=1;
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1]){
                count++;
            }else {
                System.out.println("element "+arr[i]+" occurs "+count+" times");
                count=1;
            }
        }

        System.out.println("Element "+ arr[arr.length-1]+" occurs "+ count+ " times");
    }

}
