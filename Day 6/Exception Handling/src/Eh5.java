public class Eh5 {
    public static void main(String[] args) {
        System.out.println("welcome to fruit stall");
        try{
            String [] fruits={"apple","banana","orange"};
            System.out.println("i want "+fruits[1]);
            try{
                String moreFruits=null;
                System.out.println("i want diff fruits "+moreFruits.length());
            }catch (NullPointerException inner){
                System.out.println("inner block"+inner);
            }
        }catch  (ArrayIndexOutOfBoundsException outer){
            System.out.println("outer block"+outer);
        }
    }
}
