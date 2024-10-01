import java.util.Comparator;

public class Ccomp implements Comparator<footballer> {
    public int compare(footballer a,footballer a1){
        if(a.getGoals()>a1.getGoals()){
            return 1;
        }
        if(a.getGoals()<a1.getGoals()){
            return -1;
        }
        else {
            return a1.getNmae().compareTo(a.getNmae());
        }
    }
}
