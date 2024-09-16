class base{
    String fruit="Apple";

}
class child extends  base{
    String fruit="orange";
    void function(){
        String fruit="kiwi";
        System.out.println("Local "+fruit);
        System.out.println("class "+this.fruit);
        System.out.println("base "+super.fruit);
    }
}

public class Fruits {


    public static void main(String[] args) {
            child a= new child();
            a.function();

    }
}
