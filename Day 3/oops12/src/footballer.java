public class footballer {
    public static void main(String[] args) {
      player a=new player("ronaldo",900,300);
      player b=new player(400);
      player c=new player("messi",820);
      a.details();
      b.details();
      c.details();
    }
}
//constructor overloading
class player{
    private String name;
    private int goals;
    private int assist;

    public player(String name,int goals,int assist){
        this.name=name;
        this.goals=goals;
        this.assist=assist;
    }
    public player(String name,int goals){
        this.name=name;
        this.goals=goals;

    }
    public player(int assist){

        this.assist=assist;

    }

    public void details(){
        System.out.println("player is "+name);
        System.out.println("Goals are "+goals);
        System.out.println("assits are "+assist);
    }

}