import java.util.Arrays;

public class q11 {
    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));

    }
//selection sort
    public static int [] sort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
