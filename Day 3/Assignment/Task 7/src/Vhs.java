
class Vehicle {
    String model;
    double rentalPrice;
    boolean isRented;


    public Vehicle(String model, double rentalPrice) {
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.isRented = false;
    }


    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println(model + " rented for $" + rentalPrice + " per day.");
        } else {
            System.out.println(model + " is already rented.");
        }
    }


    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println(model + " returned.");
        } else {
            System.out.println(model + " is not rented.");
        }
    }
}


class Car extends Vehicle {
    public Car(String model, double rentalPrice) {
        super(model, rentalPrice);
    }
}


class Truck extends Vehicle {
    public Truck(String model, double rentalPrice) {
        super(model, rentalPrice);
    }
}


class RentalAgency {
    String name;


    public RentalAgency(String name) {
        this.name = name;
    }


    public void rentVehicle(Vehicle vehicle) {
        System.out.println("Rental Agency: " + name);
        vehicle.rent();
    }


    public void returnVehicle(Vehicle vehicle) {
        System.out.println("Rental Agency: " + name);
        vehicle.returnVehicle();
    }
}





public class Vhs {
    public static void main(String[] args) {
        // Create vehicles
        Car car = new Car("Honda Civic", 50);
        Truck truck = new Truck("Ford F-150", 100);

        // Create a rental agency
        RentalAgency agency = new RentalAgency("City Rentals");

        // Rent and return vehicles
        agency.rentVehicle(car);
        agency.rentVehicle(truck);

        agency.returnVehicle(car);
        agency.returnVehicle(truck);
    }
}
