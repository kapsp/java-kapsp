public class Phones {
    public static void main(String[] args) {
     mobiles a= new mobiles("samsung galaxy",20000);
        System.out.println(a.getModel());
        System.out.println(a.getPrice());
    }
}
//init block

class  mobiles{
    private String model;
    private double cost;

    {
        cost=23.00;
        System.out.println(cost);
    }

    public mobiles(String model,double cost){
        this.model=model;
        this.cost=cost;
    }

    public String getModel(){
        return model;
    }

    public double getPrice(){
        return cost;
    }

}
