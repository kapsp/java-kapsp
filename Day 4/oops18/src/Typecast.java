public class Typecast {
    public static void main(String[] args) {
        goku a=new gohan();
        a.display();
        gohan b=(gohan) a;
        b.display();
    }
}

class goku{
    public void display(){
        System.out.println("goku");
    }
}

class gohan extends goku{
    public void display(){
        System.out.println("gohan");
    }
}
