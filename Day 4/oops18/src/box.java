public class box {
    public static void main(String[] args) {
        int apples=5;
        Integer boxedapples=new Integer(apples);
        System.out.println("apples in box are "+apples);

        Integer autoapples=7;
        Integer autoapples2=apples;
        System.out.println("apples are automaticlly appeared in 1 and 2 autoapples are "+(autoapples2+autoapples));

        int unboxingApple=boxedapples;
        System.out.println("we are unboxing " +unboxingApple+ "apples ");

        if(apples==unboxingApple){
            System.out.println("unboxing of apples are samee");
        }
    }

}
