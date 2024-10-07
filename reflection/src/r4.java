import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class r4 {
    public static void main(String[] args)throws IllegalArgumentException, IllegalAccessException,
            NoSuchFieldException, SecurityException {
         r1 player3=new r1();
         Class obj=player3.getClass();

        Constructor[] c1=obj.getDeclaredConstructors();

        for(Constructor c:c1){
            System.out.println("name "+c.getName());
            int mo=c.getModifiers();
            System.out.println("MOdifiers "+ Modifier.toString(mo));
            System.out.println("return type "+c.getParameterCount());
        }
    }
}
