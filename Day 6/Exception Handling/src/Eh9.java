public class Eh9 {
    public static void main(String[] args) {
        try{
            apple();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void apple(){
        System.out.println("apple");
        orange();

    }

    public static void orange(){
        System.out.println("Orange");
        System.out.println(11/0);
    }
}


