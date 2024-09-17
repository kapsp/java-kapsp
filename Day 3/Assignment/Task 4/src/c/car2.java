package c;

import vehicle.vehicle;

public class car2 extends vehicle {
        public car2(double speed){
            super(speed);
        }
        public  void display(){
            System.out.println("the spedd is "+ speed
            );
        }

        public static void main(String[] args) {
            car2 a =new car2(100.34);
            a.display();

        }

    }

