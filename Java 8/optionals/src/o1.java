import java.util.Optional;

public class o1 {
    public static void main(String[] args) {
        Optional<String> a=Optional.ofNullable(name());
        String n=a.orElse("no name");
        System.out.println(n);
    }

    public static String name(){
        return null;
    }
}
