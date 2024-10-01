public class q17 {
    public static void main(String[] args) {
        int [] a={4, 2, 10, 8, 7};
        System.out.println(MAximum(a));
    }

    public static int MAximum(int [] a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        int max_profit=max-min;
        return max_profit;
    }
}
