class Fruits {
    public void method() {
        class Apple {
            void display() {
                System.out.println("Local inner class: Apple");
            }
        }
        Apple apple = new Apple();
        apple.display();
    }
}

public class FruitTest7 {
    public static void main(String args[]) {
        Fruits fruits = new Fruits();
        fruits.method();
    }
}
