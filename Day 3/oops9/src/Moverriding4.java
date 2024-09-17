public class Moverriding4 {
    public static void main(String[] args) {
            choclate.ingredient();
    }
}

class sweet{

    static void ingredient(){
        System.out.println("sugar");
    }
}

class choclate extends  sweet{
    static void ingredient(){
        System.out.println("milk and cocoa");
    }
}
//not actually overriding the method because it's static.
//You're simply hiding the ingredient() method in the parent class.