import java.util.function.Supplier;

public class q2 {
    public static void main(String[] args) {
        Supplier<Integer> foursquare=()->{
             return 4*4;
        };
        int fs=foursquare.get();
        System.out.println(fs);
    }
}
