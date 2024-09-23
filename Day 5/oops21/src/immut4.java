public class immut4 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Dbz a=new Dbz();
        a.setName("goku");
        a.setAttack("kame-hame-ha");
        level b= new level(4,a);

        System.out.println(b);

        System.out.println("modifying");

        b.getDbz().setAttack("flash");

        System.out.println(b);

        System.out.println("again try to modify");

        b.getDbz().setName("vegeta");
        b.getDbz().setAttack("big bang");

        System.out.println(b);
        System.out.println(a);

    }

}

class Dbz implements Cloneable{
    String name;
    String attack;

    public String getName(){
        return name;
    }

    public String getAttack(){
        return attack;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAttack(String attack){
        this.attack=attack;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String toString(){
        return "the name is "+name+" and attack he uses is "+attack;
    }
}


final class level implements Cloneable{
    private final int levels;

    private final Dbz a;

    level(int levels,Dbz a) throws CloneNotSupportedException{
        this.levels=levels;
        this.a=(Dbz) a.clone();
    }

    public int getLevel(){
        return levels;
    }


    public Dbz getDbz() throws CloneNotSupportedException{
        return (Dbz) a.clone();
    }

    public String toString(){
        return a+" and the level of character is Super Saiyan "+levels;
    }
}