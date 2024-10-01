public class q3 {
    public static void main(String[] args) {
        int [] arr={3,7,1,9,5};
        System.out.println(largetNUm(arr));
    }

    public static int largetNUm(int [] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
