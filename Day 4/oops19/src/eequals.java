public class eequals {




    public static void main(String[] args) {
        fruits2 a=new fruits2("apple",2);
        fruits2 a2=new fruits2("apple",2);
        if(a.e(a2)){ System.out.println("equal");}
        else {
            System.out.println("not equal");
        }

    }
}

class fruits2{
    private String name;
    private int quantity;

    public fruits2(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
    }

    public boolean e(fruits2 a){
        if(name!=a.name){
            return false;
        }
        return true;
    }
}
