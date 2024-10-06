public class s4 {
    //lazy way
    private static  s4 kapils;

    private s4(){

    }
    private static s4 getKapils(){
        if(kapils==null) {
            synchronized (s4.class) {
                if (kapils == null) {
                    kapils = new s4();
                }
            }
        }
        return kapils;
    }

    public static void main(String[] args) {
        s4 a=s4.getKapils();
        System.out.println(a.hashCode());
        s4 b=s4.getKapils();
        System.out.println(b.hashCode());
    }
}