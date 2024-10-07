interface mul{
    int mu(int a,int b);
}

public class s1 {
    public static int multi(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        mul a=s1::multi;
        int r=a.mu(4,5);
        System.out.println(r);
    }
}
