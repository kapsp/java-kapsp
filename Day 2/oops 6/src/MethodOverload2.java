public class MethodOverload2 {
    public void dollars(int a,int b){
        System.out.println("total dollars "+(a+b));
    }
    public void dollars(double a,double b){
        System.out.println("total dollars "+(a+b));
    }
    public void dollars(double a,int b){
        System.out.println("total dollars "+(a+b));
    }

    public static void main(String[] args) {
        MethodOverload2 dollar=new MethodOverload2();
        dollar.dollars(12,56);
        dollar.dollars(12.4,34.2);
        dollar.dollars(40.7,56);
    }
}
