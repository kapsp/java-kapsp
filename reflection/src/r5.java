import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class r5 {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException,
            NoSuchFieldException, SecurityException, NoSuchMethodException,InvocationTargetException {
        r1 player4=new r1();
        Class obj5=player4.getClass();

        Method m=obj5.getDeclaredMethod("privateInformation");
        m.setAccessible(true);
        m.invoke(player4);

    }
}
