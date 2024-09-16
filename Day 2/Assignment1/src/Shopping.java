//Task 3: Implement a Java class to manage a shopping cart,
//        with an instance data member to store the items in the cart
//        and instance methods to add, remove, and calculate the total price of the items.

import java.util.ArrayList;

public class Shopping {
    private ArrayList<String> item =new ArrayList<>();
    private ArrayList<Float> prices=new ArrayList<>();

    public void additems(String item, float prices){
        this.item.add(item);
        this.prices.add(prices);
    }

    public void remove(String item){
        int index=this.item.indexOf(item);
        this.item.remove(index);
        prices.remove(index);
    }

    public double calculate(){
        double totalprice=0;
        for(double p:prices){
            totalprice+=p;

        }
        return totalprice;
    }

    public static void main(String[] args) {
        Shopping a=new Shopping();
        a.additems("apple",10);
        a.additems("banana",8);
        a.remove("banana");
        a.additems("orange",13);

        System.out.println(a.calculate());

    }
}
