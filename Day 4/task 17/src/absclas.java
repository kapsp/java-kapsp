
abstract class movies{
    private String name;
    public movies(String name){
        this.name=name;
    }

    abstract int totalmovies();
}

class hollywood extends movies{
    private String name;
    private int hit;
    private int flops;
    public hollywood(String name,int hit,int flops){
        super(name);
        this.hit=hit;
        this.flops=flops;
    }
    public int totalmovies(){
        return  (hit+flops);
    }

}
public class absclas {
    public static void main(String[] args) {
        hollywood a =new hollywood("leonardo",3,2);
        System.out.println(a.totalmovies());
    }


}
