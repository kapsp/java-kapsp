public class s2 {
    private static s2 ball;
    static {
        ball=new s2();
    }

    private s2(){

    }
    public static s2 getball(){
        return ball;
    }

    public static void main(String[] args) {
        s2 a=s2.getball();
        System.out.println(a.hashCode());
    }
}
