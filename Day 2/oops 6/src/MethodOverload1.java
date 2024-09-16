public class MethodOverload1 {
    public void addballs(int a){
        System.out.println("balls = "+(a));
    }
    public void addballs(int a,int b){
        System.out.println("balls = "+(a +b));
    }
    public void addballs(int a,int b,int c){
        System.out.println("balls = "+(a+b+c));
    }

    public static void main(String[] args) {
        MethodOverload1 ball =new MethodOverload1();
        ball.addballs(10);
        ball.addballs(10,20);
        ball.addballs(10,20,30);
    }
}
