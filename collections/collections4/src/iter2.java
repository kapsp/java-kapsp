import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class iter2 {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList();
        for (int i=0;i<10;i++){
            a.add(i);
        }

        System.out.println(lit2(a));


    }

    public static List<Integer> lit2(List<Integer> q){
        ListIterator<Integer> a= q.listIterator(q.size());

        while(a.hasPrevious()){
            Integer z= a.previous();
            if(z%2==0){
                a.remove();
            }
            if(z==3){
                a.set(16);

            }
            if(z==7){
                a.add(20);
                a.previous();
            }
        }


        return q ;
    }
}
