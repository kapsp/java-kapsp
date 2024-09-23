class Fruits {
    int type = 10;

    class Apple {
        private int type = 20;

        void display() {
            int type = 30;
            System.out.println(type);
            System.out.println(this.type); 
            System.out.println(Fruits.this.type);
    }
}

public class FruitTest6 {
    public static void main(String args[]) {
        Fruits fruits = new Fruits();
        Fruits.Apple apple = fruits.new Apple();
        apple.display();
    }
}
}
