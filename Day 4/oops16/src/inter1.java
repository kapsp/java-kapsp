public class inter1 {
    public static void main(String[] args) {
        ball a=new soccerr();
        a.balltype();
    }
}

interface ball{
    void balltype();
}

class soccerr implements ball{
 public void balltype(){
     System.out.println("soccer");
 }
}
