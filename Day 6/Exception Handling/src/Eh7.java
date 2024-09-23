public class Eh7 {
    public static void main(String[] args) {
        try {
            int apples =5*5;
        }catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally is exceuted");
        }
        System.out.println("other code");
    }
}
