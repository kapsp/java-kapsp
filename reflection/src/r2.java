import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class r2 {
    public static void main(String[] args) throws IllegalArgumentException,
            IllegalAccessException, NoSuchFieldException, SecurityException {
        r1 player=new r1();
        Class obj=player.getClass();

        Field f2=obj.getField("name");

        f2.set(player,"messi");

        String value1=(String) f2.get(player);
        System.out.println(value1);

        int modifier1=f2.getModifiers();
        String m1= Modifier.toString(modifier1);
        System.out.println(m1);

        Field f1=obj.getDeclaredField("club");
        f1.setAccessible(true);
        f1.set(player,"Real madrid");

        String value=(String) f1.get(player);
        System.out.println(value);

        int modifier=f1.getModifiers();
        String m= Modifier.toString(modifier);
        System.out.println(m);
        System.out.println(player.getInfo());
    }
}
