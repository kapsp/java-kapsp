import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Map<String,Integer> a=new HashMap<>();
        a.put("apple",3);
        a.put("banana",7);
        a.put("cherry",1);
        a.put("date",9);
        a.put("fig",5);

        sort(a);
    }

    public static void sort(Map<String,Integer> a){

        Set<Map.Entry<String,Integer>> b=new TreeSet<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
       b.addAll(a.entrySet());

       for(Map.Entry<String,Integer> k:b){
           System.out.println(k.getKey()+":"+k.getValue());
        }


    }


}

//public class Coomp implements Comparator<Integer>{
//    public int compare(Integer a,Integer b){
//        if(a<b){
//            return -1;
//
//        }
//        if(a>b){
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }
//}
