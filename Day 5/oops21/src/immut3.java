public class immut3 {
    public static void main(String[] args)  throws CloneNotSupportedException {
        junglebook q=new junglebook();

        q.setBear("baloo");
        q.setWolf("bagheera");
         author w=new author("kipling",1964,q);
        System.out.println(w.getName());
        System.out.println(w.getYear());
        System.out.println(w.getBook().bear);
        System.out.println(w.getBook().wolf);

        System.out.println("modifying");

        w.getBook().setWolf("moti");

        System.out.println(w.getBook().wolf);

    }
}

class junglebook implements Cloneable{
    String bear;
    String wolf;

    public String getBear(){
        return bear;
    }

    public String getWolf(){
        return wolf;
    }

    public void setBear(String bear){
        this.bear=bear;
    }

    public void setWolf(String wolf){
        this.wolf=wolf;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

final class author implements Cloneable{
    private final String name;
    private final int launched;

    private final junglebook a;

    author(String name,int launched,junglebook a){
        this.name=name;
        this.launched=launched;
        this.a=a;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return  launched;
    }

    public junglebook getBook() throws CloneNotSupportedException{
        return (junglebook) a.clone();
    }
}