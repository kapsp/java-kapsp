public class shallow {
    public static void main(String[] args) throws CloneNotSupportedException {

            ocean t=new ocean("pacific");
            islands q=new islands(t,"kapil island",45);
            islands q2=(islands) q.clone();
            System.out.println(q);
            System.out.println(q2);
        System.out.println("modifying");
        q.a.name="atlantic";
        System.out.println(q);
        System.out.println(q2);


    }
}

class ocean{
   String name;

    public ocean(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}

class islands implements Cloneable{
    String name;
    int trees;
    ocean a;

   public islands(ocean a,String name,int trees){
         this.a=a;
         this.name=name;
         this.trees=trees;
   }

   public Object clone() throws CloneNotSupportedException{
       return super.clone();
   }

   public String toString(){
       return "islands[name of ocean is "+a+",it has total trees "+trees+" and name of island is "+name+"] ";
   }


}
