//Create a superclass Vehicle with a protected attribute speed. Create a subclass Car that inherits
// from Vehicle and
//has a method displaySpeed() to access and display the speed attribute.
//usecase 1 - create car class within same package. usecase 2 - create car class within other package



package vehicle;


public class vehicle {
    protected double speed;
    public vehicle(){}

    public vehicle(double speed){
        this.speed=speed;
    }


}
