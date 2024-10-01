import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arralist3 {
    public static void main(String[] args) {
        List<String> a=new ArrayList();
        a.add("goku");
        a.add("is");
        a.add("good");
        a.add("strong and");
        a.remove("good");

        List<String> b=new ArrayList<>();
        b.add("vegeta is");
        b.add("also strong");

        a.addAll(b);

       String[] arr=new String[a.size()];
       a.toArray(arr);
        for( String q:a){
            System.out.print(q+" ");
        }

        System.out.println("\nprinting array without using loop - "+ Arrays.toString(arr));
    }
}
