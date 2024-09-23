public class Eh8 {
    public static void main(String[] args) throws OwnException {
        try{
            int apples=16;
            if(apples>15){
                throw new OwnException("a single person cannot have more than 15 apples");
            }
        }catch (OwnException e){
            System.out.println(e.getMessage());
            System.out.println(e);

        }
    }
}

class OwnException extends Exception{
    public OwnException(String m){
        super(m);
    }
}