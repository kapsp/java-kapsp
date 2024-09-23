public class inter3 {
    public static void main(String[] args) {
      player a =new player();
      a.batsman();
      a.bowler();
      a.name();
    }
}



interface bowl {
    void bowler();
}

interface bat {
    void batsman();
}
interface cricketer extends bat,bowl{
    void name();
}
class player implements cricketer{
 private boolean isbowler=true;
    public void name(){
        isbowler=false;
        System.out.println("kohli");
    }

    public void bowler(){
        isbowler=true;
        System.out.println("not a bowler");
    }
    public void batsman(){
        System.out.println("yes btasman");
    }
}