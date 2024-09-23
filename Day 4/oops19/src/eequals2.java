public class eequals2 {
    public static void main(String[] args) {
        String s1 = new String("goku");
        String s2 = new String("goku");
        if(s1==s2)
            System.out.println("true");
        else
            System.out.println("false");

        if (s1.equals(s2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
