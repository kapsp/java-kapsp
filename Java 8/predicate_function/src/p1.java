import java.util.function.Predicate;

public class p1 {
    public static void main(String[] args) {
        int a=25;

        Predicate<Integer> b=age->age>21;
        System.out.println(b.test(a));
    }
}
