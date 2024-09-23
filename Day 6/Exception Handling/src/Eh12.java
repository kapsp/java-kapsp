import java.io.IOException;

public class Eh12 {
    public static void main(String[] args) {
        Mango1 a=new alphanso1();
        try {
            a.method();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}

class Mango1 {
    public void method() throws IOException{

        System.out.println("tasty mango");
        throw new IOException("no");
    }
}

class alphanso1 extends Mango1{
    public void method() throws ArithmeticException{
        try{
            System.out.println("tasty alphanso");
            super.method();
        }catch (IOException e){
            System.out.println("alphanso "+e);
        }
    }

}