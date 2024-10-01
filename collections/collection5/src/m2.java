import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class m2 {
    public static void main(String[] args) {
        Map<Integer,String> animals=new HashMap<>();
        animals.put(1,"tiger");
        animals.put(2,"Lion");
        animals.put(3,"deer");

        Set<Integer> a=animals.keySet();
        for(Integer k:a){
            System.out.println("the serial number is "+k+" and its value is "+animals.get(k));
        }

        Iterator<Map.Entry<Integer,String>> itr=animals.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> c=itr.next();
            System.out.println(c.getKey()+": "+c.getValue());
        }
    }
}
