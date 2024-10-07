
//lambda expression

interface dbz{
    void goku();
}
public class q3 {
    public static void main(String[] args) {
        dbz a=()->{
            System.out.println("uses kamehameha");
        };

        a.goku();
    }
}
