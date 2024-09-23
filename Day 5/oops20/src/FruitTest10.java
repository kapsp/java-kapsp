class Fruits {
    public void method() {
        int localValue = 100;
        class Apple {
            void display() {
                System.out.println(localValue);
                System.out.println("Local inner class: Apple");
            }
        }
        Apple apple = new Apple();
        apple.display();
    }
}

public class FruitTest10 {
    public static void main(String args[]) {
        Fruits fruits = new Fruits();
        fruits.method();
    }
}
