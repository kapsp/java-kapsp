import java.util.*;

public class q3 {
    public static void main(String[] args) {
        List <Integer> a=new ArrayList<>();
        a.add(3);
        a.add(7);
        a.add(1);a.add(9);a.add(5);
        System.out.println(method(a));


    }

    public static List method(List<Integer> a){
        ListIterator<Integer> e=a.listIterator();
        while(e.hasNext()){
            Integer z=e.next();
            if(z==7){
                e.remove();
            }
            if (z==1){
                e.add(10);
            }
        }
        return a;
    }
}
