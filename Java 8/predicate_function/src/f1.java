import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class f1 {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>(Arrays.asList(5,8,2,8));
        Function<Integer,Integer> b=num->num*num;
        List<Integer> c=new ArrayList<>();
        for (int n:a){
            c.add(b.apply(n));
        }
        System.out.println(c);
    }
}
