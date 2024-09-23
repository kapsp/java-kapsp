class Chocolate implements Cloneable {
 String brand;
int quantity;

   public Chocolate(String brand,int quantity){
       this.brand=brand;
       this.quantity=quantity;
   }

   public Object clone() throws CloneNotSupportedException{
       return super.clone();
   }
}

public class clon {
    public static void main(String[] args) {
        try{
            Chocolate a=new Chocolate("cadbury",5);
            Chocolate b=(Chocolate) a.clone();
            System.out.println("i have "+b.quantity+b.brand);
        }catch(CloneNotSupportedException e){

        }


    }
}
