import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Extensions {
    public static void main(String[] args) {
        Set<Integer> a=new LinkedHashSet<>();
        a.add(3);
        a.add(7);
        a.add(1);
        a.add(6);

        System.out.println("linkedHashset-\n" + a);

        Set<Integer> b=new TreeSet<>();
        b.add(3);
        b.add(7);
        b.add(1);
        b.add(6);
        System.out.println("treeset-\n" + b);


        Set<Integer> c=new TreeSet<>(new Coommparator());
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(8);

        System.out.println(" custom treeset-\n" + c);
    }
}
