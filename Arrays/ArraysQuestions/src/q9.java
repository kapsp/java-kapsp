public class q9 {
    public static void main(String[] args) {
        int[] arr={3,7,1,9,5};
        System.out.println(targetE(arr,7));

    }

    public static int targetE(int [] arr,int t){
        int b=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==t){
                b=i;
            }
        }
        return b;
    }


}
