import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class f2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("messi","kapil","kohli"));
        Function<String, String> toUppercase = str -> str.toUpperCase();

        List<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(toUppercase.apply(name));
        }

        System.out.println(uppercaseNames);
    }
}