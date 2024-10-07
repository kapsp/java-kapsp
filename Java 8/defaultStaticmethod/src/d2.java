
import java.util.ArrayList;
import java.util.List;

public class d2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("kapil");
        names.add("soham");
        names.add("kekre");
        names.add("malwe");


        names.forEach(name -> System.out.println("Hello " + name));
    }
}