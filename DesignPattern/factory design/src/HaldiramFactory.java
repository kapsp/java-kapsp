public class HaldiramFactory {
    public static Haldiram product(String Sweets){
        if(Sweets.equalsIgnoreCase("orangeburfee")){
            return new orangeBurfee();
        }
        if(Sweets.equalsIgnoreCase("kajuKatli")){
            return new kajuKatli();
        }
        else {
            return null;
        }
    }
}
