package Seribreak;

import java.io.*;

class Singleton2 implements Serializable {
    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}

public class SerializationBreak {
    public static void main(String[] args) throws Exception {
        Singleton2 instance1 = Singleton2.getInstance();

        // Serialize instance1 to a file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance1);
        out.close();

        // Deserialize from the file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton2 instance2 = (Singleton2) in.readObject();
        in.close();

        System.out.println(instance1 == instance2);  // Outputs: false
    }
}
