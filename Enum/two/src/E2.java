public class E2 {
    public enum footballers{
        Messi,ronaldo,klose,pele,rooney,kaka,vardy
    }

    public static void main(String[] args) {
        footballers[] a=footballers.values();
        for(footballers v:a){
            switch (v){
                case kaka:
                    System.out.println("kaka");
                    break;
                case pele:
                    System.out.println("pele");
                    break;
                case klose:
                    System.out.println("klose");
                    break;
                case Messi:
                    System.out.println("messi");
                    break;
                case vardy:
                    System.out.println("vardy");
                    break;
                case ronaldo:
                    System.out.println("ronaldo");
                    break;
                case rooney:
                    System.out.println("ronney");
                    break;
            }
        }
    }
}
