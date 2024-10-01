import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iter {
    public static List<Integer> lit(List<Integer> a){
        Iterator<Integer> b=  a.iterator();
        while (b.hasNext()){
            Integer value= b.next();
            if(value%2!=0){
                b.remove();
            }
        }
        return a;

    }

    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        for (int i=0;i<=20;i++){
            a.add(i);
        }
        System.out.println(lit(a));
    }
}
