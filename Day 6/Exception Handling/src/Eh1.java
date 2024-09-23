import java.util.Scanner;

public class Eh1 {



        public static void main(String args[]) {
            System.out.println("Enter car's speed (km/h):");
            Scanner scanner = new Scanner(System.in);
            int speed = scanner.nextInt();

            System.out.println("Enter time traveled (hours):");
            int time = scanner.nextInt();


            double distance = speed * time;
            System.out.println("The car traveled: " + distance + " km");

            System.out.println("Rest of the code...");

            scanner.close();
        }
    }


