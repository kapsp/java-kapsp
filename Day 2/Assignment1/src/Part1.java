//Task 1: Implement a class with a static variable to count the number of
//    instances and then Create multiple instances of this class and print the count.

public class Part1 {
     private static int count;
     public static void counter(){
         count++;
     }
     public static int getCount( ){
         return  count;
     }

    public static void main(String[] args) {
        Part1 a =new Part1();
        Part1 b =new Part1();
        Part1 c =new Part1();
        a.counter();
        b.counter();
        c.counter();
        System.out.println(Part1.getCount());


    }
}
