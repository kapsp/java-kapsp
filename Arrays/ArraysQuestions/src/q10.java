public class q10 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        System.out.println(targetE2(arr,5));

    }

    //binary search
    public static int targetE2(int [] arr,int t){
       int left=0;
       int right=arr.length-1;
       int mid=0;
       while(left<=right){
            mid=left+(right-left)/2;
           if(arr[mid]==t){
               return mid;
           }
           if(arr[mid]<t){
               left=mid+1;
           }
           else {
               right=mid-1;
           }
       }
       return mid;
    }
}
