interface addition{
    int add(int a,int b);
}

public class I1 {
    public static void main(String[] args) {
        I1 a=new I1();
        addition c=a::caladd;

        int result=c.add(4,5);
        System.out.println(result);

    }

    public int caladd(int a,int b){
        return a+b;
    }
}
