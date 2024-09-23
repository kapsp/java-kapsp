public class Eh4 {
    public static void main(String[] args) {
        int[] photo = new int[4];
        try{
            photo[5]=43;

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
