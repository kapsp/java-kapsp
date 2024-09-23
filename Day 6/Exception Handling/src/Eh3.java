import java.util.Scanner;

public class Eh3 {
    public static void main(String[] args) {
        System.out.println("welcome to kulfi shop we seel mango and rabdi kulfi");
        Scanner scan=new Scanner(System.in);
        System.out.println("how many mango kulfi you want");
        int mango=scan.nextInt();
        System.out.println("how many rabdi kulfi you want");
        int rabdi=scan.nextInt();
        double price;
     double [] prices=new double[4];
     int i=5;

        try{
          price=(mango*15)+(rabdi*10);
          double totalmangoprice=price/mango;
             prices[i]=price;
            System.out.println("your bill is "+price);
            if(mango==0){
                throw new ArithmeticException("cannot find total mangobill because mango cannot be zero");
            }
            System.out.println("your mangoBill is "+ totalmangoprice);

        }
        catch (ArithmeticException e){
            System.out.println(e+" price cannot be zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("other code");

    }
}
