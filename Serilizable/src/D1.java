import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class D1 {
    public static void main(String[] args) {
        try {

            FileInputStream z=new FileInputStream("player.txt");
            ObjectInputStream c=new ObjectInputStream(z);
            S1 r=(S1) c.readObject();
            System.out.println(r);
            c.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
