class Fruits {
    static String type = "Fruit";
    String color = "Red";

    class Apple {
        void show() {
            System.out.println(type);
            System.out.println(color);
        }
    }
}

public class FruitTest4 {
    public static void main(String args[]) {
        Fruits fruits = new Fruits();
        Fruits.Apple apple = fruits.new Apple();
        apple.show();
    }
}
