class Singleton1 implements Cloneable {
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneBreak {
    public static void main(String[] args) throws Exception {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = (Singleton1) instance1.clone();

        System.out.println(instance1 == instance2);
    }
}
