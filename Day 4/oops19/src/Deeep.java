public class Deeep {
    public static void main(String[] args) throws CloneNotSupportedException {
      oceans w=new oceans("pacific");
       island z=new island(w,"kapil islands",23);
       island x=(island) z.clone();
        System.out.println(z);
        System.out.println(x);
        System.out.println("modifying");
        x.a.name="atlantic";
        System.out.println(z);
        System.out.println(x);
    }
}

class oceans implements Cloneable{
    String name;

    public oceans(String name){
        this.name=name;
    }

    public Object clone() throws CloneNotSupportedException{
         return super.clone();
    }

    public String toString(){
        return name;
    }
}

class island implements Cloneable{
    String name;
    int tress;

    oceans a;

    public island(oceans a,String name,int tress){
        this.a=a;
        this.name=name;
        this.tress=tress;
    }

    public Object clone() throws CloneNotSupportedException{
        island q=(island) super.clone();
        q.a=(oceans) a.clone();
        return q;

    }

    public String toString(){
        return "island[the name of ocean is "+a+" and name of island is "+name+" and it has total "+tress+" trees]";
    }
}
