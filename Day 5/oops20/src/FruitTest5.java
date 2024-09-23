class Fruits {
    class Apple {
        void show() {
            System.out.println("Instance method: Apple class");
        }
    }
}

public class FruitTest5 {
    public static void main(String args[]) {
        Fruits fruits = new Fruits();
        Fruits.Apple apple = fruits.new Apple();
        apple.show();
    }
}
