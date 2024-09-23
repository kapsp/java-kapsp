interface Fruits {
    void display();
}

public class FruitTest11 {
    public static void main(String[] s) {
        Fruits apple = new Fruits() {
            public void display() {
                System.out.println("Implementation Class: display()");
            }
        };
        apple.display();
    }
}
