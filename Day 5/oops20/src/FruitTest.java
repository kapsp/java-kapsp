class Fruits {
    static String type = "Fruit";

    static class Apple {
        static void showType() {
            System.out.println("This is an Apple, which is a type of " + Fruits.type);
        }
    }
}

public class FruitTest {
    public static void main(String[] args) {
        
        Fruits.Apple.showType();

      
        Fruits.Apple apple = new Fruits.Apple();
        apple.showType();
    }
}
