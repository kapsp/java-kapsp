import java.util.Optional;

public class o2 {
    public static void main(String[] args) {
        Optional<String> a=Optional.ofNullable(name());
        String n=a.map(String::toUpperCase).orElse("no name");
        System.out.println(n);
    }

    public static String name(){
        return "kapil";
    }
}
