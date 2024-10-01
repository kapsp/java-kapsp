

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class m1 {
    public static void main(String[] args) {
        Map<String,Integer> playes=new HashMap<>();

        playes.put("ronaldo",800);
        playes.put("messi",700);
        playes.put("pele",600);

        System.out.println(playes.get("messi"));

      Collection<Integer> a=playes.values();
        System.out.println(a);

        Set<String> b=playes.keySet();
        System.out.println(b);

    }
}
