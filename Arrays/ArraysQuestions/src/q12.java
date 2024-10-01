import java.util.Arrays;

//bubble sort
public class q12 {
    public static void main(String[] args) {
        int[] arr={3,7,1,9,5};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }

    public static int[] bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;

    }
}
