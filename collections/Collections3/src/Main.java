import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        footballer a=new footballer("zapil",800);
        footballer b=new footballer("malwe",200);
        footballer c=new footballer("soham",700);

        Set<footballer> q=new TreeSet<footballer>(new Ccomp());
        q.add(a);
        q.add(b);
        q.add(c);
        System.out.println(q);
    }
}
