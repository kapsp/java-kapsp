

class Fruits {
    static String type = "Fruit";
    String color = "Green";

    static class Apple {
        static void show() {
            System.out.println(type);
        }
    }
}

public class FruitTest2 {
    public static void main(String args[]) {
        Fruits.Apple.show();
        Fruits.Apple apple = new Fruits.Apple();
        apple.show();
    }
}
