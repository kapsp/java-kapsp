public class footballer {
    public static void main(String[] args) {
        //anonymous object
       player a= new player();
       a.setData("ronaldo",900,300);
        player b= new player();
        b.setData(a);
        a.details();
        b.details();


    }
}
//call by value and refence
class player{
    private String name;
    private int goals;
    private int assist;

    public void setData(String name,int goals,int assist){
        this.name=name;
        this.goals=goals;
        this.assist=assist;
    }

    public void setData(player a){
        this.name=a.name;
        this.goals=a.goals;
        this.assist=a.assist;
    }


    public void details(){
        System.out.println("player is "+name);
        System.out.println("Goals are "+goals);
        System.out.println("assits are "+assist);
    }

}