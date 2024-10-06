import java.lang.reflect.Constructor;

class Singleton3 {
    private static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}

public class ReflectionBreak {
    public static void main(String[] args) throws Exception {
        Singleton3 instance1 = Singleton3.getInstance();

        Constructor<Singleton3> constructor = Singleton3.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton3 instance2 = constructor.newInstance();

        System.out.println(instance1 == instance2);
    }
}
