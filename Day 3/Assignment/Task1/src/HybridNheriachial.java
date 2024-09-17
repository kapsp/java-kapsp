public class HybridNheriachial {

    public static void main(String[] args) {
        stats a=new stats();
        a.getName("football");
        a.getplayer("ronaldo");
        a.played(1089);
        a.details();
        coach c=new coach();
        c.getName("football");
        c.coach("alex ferguson");
        c.details1();

    }

}

class sports1{
    String name;
    public void getName(String name){
        this.name=name;
    }

}

class player1 extends sports{
    String playername;
    public void getplayer(String playername){
        this.playername=playername;
    }
}

class coach extends sports{
    String coachname;
    public void coach(String coachname){
        this.coachname=coachname;
    }
    public void details1(){
        System.out.println(coachname+ "is a coach of "+name);
    }
}

class stats1 extends player{
    int matches;

    public void played(int matches){
        this.matches=matches;
    }

    public void details(){
        System.out.println("sports "+name);
        System.out.println("player "+playername);
        System.out.println("matches "+matches);
    }

}