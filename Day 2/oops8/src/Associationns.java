class Car{
    String car;

    public void setcar(String car){
        this.car=car;

    }
}

public class Associationns {

    private String company;
    private int price;




    public static void main(String[] args) {
        Car c= new Car();
        c.setcar("camry");
         Associationns a =new Associationns();
         a.company="Toyota";
         a.price=25000;
        System.out.println("car "+c.car+" company "+a.company+" price "+a.price);

    }

}




