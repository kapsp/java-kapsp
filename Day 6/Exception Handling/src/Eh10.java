import java.io.IOException;

public class Eh10 {
    public static void main(String[] args) {
        try{
            apple();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void apple() throws IOException {
        System.out.println("apple");
        orange();

    }

    public static void orange() throws IOException{
        System.out.println("Orange");
        throw new IOException();
    }
}


