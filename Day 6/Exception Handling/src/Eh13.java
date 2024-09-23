import java.io.IOException;

public class Eh13 {
    public static void main(String[] args) {
        Mango2 a=new alphanso2();
        try {
            a.method();
        }catch (RuntimeException e){
            System.out.println(e);
        }

    }
}

class Mango2 {
    public void method() throws ArithmeticException{

        System.out.println("tasty mango");
        throw new ArithmeticException("no");
    }
}

class alphanso2 extends Mango2{
    public void method() throws RuntimeException{
        try{
            System.out.println("tasty alphanso");
            super.method();
        }catch (RuntimeException e){
            System.out.println("alphanso "+e);
        }
    }

}