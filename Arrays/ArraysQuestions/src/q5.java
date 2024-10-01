public class q5 {
    public static void main(String[] args) {
        int [] arr={3,7,1,9,5};
        System.out.println(largetNUm(arr));
    }

    public static int largetNUm(int [] arr){
        int min=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
