import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class S1 implements Serializable {
    private String name;
    private String whichgame;

    public S1(String name,String whichgame){
        this.name=name;
        this.whichgame=whichgame;
    }
    public String toString(){
        return  name +" plays game of "+whichgame;
    }

    public static void main(String[] args) {
        try{
            S1 q= new S1("kapil dev","cricket");
        FileOutputStream a= new FileOutputStream("player.txt");
            ObjectOutputStream b=new ObjectOutputStream(a);
            b.writeObject(q);
            b.flush();
            b.close();
            System.out.println("data write suceesfully");


    }catch (Exception e){
            System.out.println(e);
        }
    }

}
