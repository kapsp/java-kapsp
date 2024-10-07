import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class r3 {
    public static void main(String[] args)
            throws IllegalArgumentException, IllegalAccessException,
            NoSuchFieldException, SecurityException{
         r1 player1=new r1();
         Class obj1=player1.getClass();

        Field[] f2= obj1.getDeclaredFields();
        for(Field n:f2){
            System.out.println("name "+n.getName());
            int m=n.getModifiers();
            System.out.println("MOdifiers "+ Modifier.toString(m));
            System.out.println("return type "+n.getType());
        }
    }
}
