abstract class milk{
   String From;
   public milk(String From){
        this.From=From;
    }
    abstract void print();
}

class coffee extends milk{
    private String ingredient;
    public coffee(String From,String ingredient ){
        super(From);
        this.ingredient=ingredient;
    }

    public void print(){
        System.out.println("Milk is from "+From+" and the ingredient i have is "+ingredient+" so i am making combination of milk and "+ingredient);
    }
}

public class absconst {
    public static void main(String[] args) {
      coffee a=new coffee("cow","coffee");
      a.print();
    }
}
