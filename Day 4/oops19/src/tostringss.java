public class tostringss {
    public static void main(String[] args) {
        fruits a=new fruits("apple",2);
        System.out.println(a);
    }
}

class fruits{
    private String name;
    private int quantity;

    public fruits(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
    }

    public String toString() {
        return "fruits{name='" + name + "', Quantity=" + quantity + "}";
    }
}
