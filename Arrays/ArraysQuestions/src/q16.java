public class q16 {
    public static void main(String[] args) {
  int [] arr={1, 3, 5, 2, 4, 6, 8};
        System.out.println(peakelement(arr));
    }

    public static int peakelement(int [] arr){
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while(l<r){
             mid=l+(r-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }else {
                r=mid;
            }

        }
        return arr[l];

    }
}
