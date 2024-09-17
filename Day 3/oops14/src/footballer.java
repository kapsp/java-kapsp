public class footballer {
    public static void main(String[] args) {
        //anonymous object
    new player("ronaldo",900,300).details();

    }
}
//constructor chaining
class player{
    private String name;
    private int goals;
    private int assist;

    public player(String name,int goals,int assist){
        this.name=name;
        this.goals=goals;
        this.assist=assist;
    }


    public void details(){
        System.out.println("player is "+name);
        System.out.println("Goals are "+goals);
        System.out.println("assits are "+assist);
    }

}