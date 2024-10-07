import java.util.Optional;

public class o3 {
    public static void main(String[] args) {
        Optional<Integer> a=Optional.ofNullable(num());
        Optional<Integer> b=a.filter(num->num>18);
        if(b.isPresent()){
            System.out.println("you can drive");
        }else {
            System.out.println("you cannot drive");
        }
    }

    public static int num(){
        return 19;
    }
}
