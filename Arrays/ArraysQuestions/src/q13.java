public class q13 {
    static int findMissingNumberInArray(int[] arr) {

        int n=arr.length+1;

        int formula_sum=(n*(n+1))/2;
        int sum_of_first_natural_num=0;
        for(int a:arr){
            sum_of_first_natural_num+=a;
        }
        int missing=formula_sum-sum_of_first_natural_num;
        return missing;

    }
    public static void main(String[] args) {
        int[] myArray={1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println(findMissingNumberInArray(myArray));
    }
}