class Fruits {
    int type = 10;
    static int variety = 20;

    public static void method() {
        class Apple {
            void display() {
                System.out.println(variety);
                System.out.println("Local inner class: Apple");
            }
        }
        Apple apple = new Apple();
        apple.display();
    }
}

public class FruitTest8 {
    public static void main(String args[]) {
        Fruits fruits = new Fruits();
        fruits.method();
    }
}
