class Fruits {

    static class Apple {

        static void show() {
            System.out.println("Static method: Apple class");
        }

        void display() {
            System.out.println("Instance method: Apple class");
        }
    }

    public static void main(String[] a) {

    }
}

public class FruitTest3 {
    public static void main(String args[]) {
        Fruits.Apple.show();
        Fruits.Apple apple = new Fruits.Apple();
        apple.display();
    }
}
