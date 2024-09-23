import java.util.Scanner;

public class Eh2 {
    public static void main(String args[]) {
        System.out.println("Enter distance traveled (km):");
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();

        System.out.println("Enter fuel consumed (liters):");
        int fuel = scanner.nextInt();

        try {
            double efficiency = distance / fuel;
            System.out.println("Fuel efficiency: " + efficiency + " km/l");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e + ". Fuel consumption cannot be zero.");
        }

        System.out.println("Rest of the code...");
    }
}
