public class Multilevel {
    public static void main(String[] args) {
     stats a=new stats();
     a.getName("football");
     a.getplayer("ronaldo");
     a.played(1089);
     a.details();

    }

}

class sports{
String name;
     public void getName(String name){
         this.name=name;
     }

}

class player extends sports{
  String playername;
    public void getplayer(String playername){
        this.playername=playername;
    }
}

class stats extends player{
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