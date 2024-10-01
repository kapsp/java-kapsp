import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arralist4 {
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
//
//        String[] arr=new String[a.size()];
//        a.toArray(arr);
//        for( String q:a){
//            if(!(q.equals("is"))) {
//                System.out.print(q + " ");
//            }
//        }

        //iterator
        Iterator<String> itr=a.iterator();
        while(itr.hasNext()){


           String value=(String) itr.next();
            System.out.println(value);

           if(value.equals("goku")){
               itr.remove();
           }


        }
        System.out.println(a);

//        System.out.println("\nprinting array without using loop - "+ Arrays.toString(arr));
    }
}
