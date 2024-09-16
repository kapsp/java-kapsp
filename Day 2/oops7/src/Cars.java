class Car{
    String car;

    public void setcar(String car){
        this.car=car;

    }
}

public class Cars extends Car {

     private String company;
    private int price;

    public void addData(String company,int price){
        this.company=company;
        this.price=price;
    }

    public void prsent(){
        System.out.println(car);
        System.out.println(company);
        System.out.println(price);;
    }

    public static void main(String[] args) {
        Cars c= new Cars();
        c.addData("Toyota",2500);
        c.setcar("camry");
        c.prsent();
    }

}
