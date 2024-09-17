class Fruit{

}
class Mango extends Fruit{

}

class Alphanso {
    Fruit function(){
        System.out.println("alphanso");
        return new Fruit();
    }
}

class ratnagiriAlphanso extends Alphanso{
    Mango function(){
        System.out.println("Ratnagiri alphanso");
        return new Mango();
    }
}


public class Moverriding5 {
    public static void main(String[] args) {
        ratnagiriAlphanso a=new ratnagiriAlphanso();
        a.function();
    }
}
//
//covariant return types, which allow an overridden
//method to return a subtype of the original return type.