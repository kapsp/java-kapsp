import java.io.IOException;

public class Eh11 {
    public static void main(String[] args) {
        Mango a=new alphanso();
        try {
            a.method();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}

class Mango {
    public void method() throws IOException{

            System.out.println("tasty mango");
          throw new IOException("no");
    }
}

class alphanso extends Mango{
    public void method(){
        try{
            System.out.println("tasty alphanso");
            super.method();
        }catch (IOException e){
            System.out.println("alphanso "+e);
        }
    }

}