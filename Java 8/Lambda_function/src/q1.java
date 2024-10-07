import java.util.function.Consumer;

public class q1 {
    public static void main(String[] args) {
        Consumer<Integer> square=(num)->{
            System.out.println(num*num);
        };

        square.accept(5);
    }
}
