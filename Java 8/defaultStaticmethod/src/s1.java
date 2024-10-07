interface MathOperation {
    int operate(int a, int b);

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }
}

public class s1 {
    public static void main(String[] args) {
        int x = 100;
        int y = 20;

        int result1 = MathOperation.mul(x, y);
        int result2 = MathOperation.div(x, y);

        System.out.println("Multiplication " + result1);
        System.out.println("Division: " + result2);
    }
}
