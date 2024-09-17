package vehicle;

public class car extends vehicle {

    public car(double speed){
        super(speed);
    }
    public  void display(){
        System.out.println("the spedd is "+ speed
        );
    }

    public static void main(String[] args) {
           car a =new car(100.34);
           a.display();

    }

}
