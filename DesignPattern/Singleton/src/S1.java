public class S1 {

    //singleton initializing at starting only and once so another time code cannot
    //be created
    private static S1 address=new S1();

    private S1(){

    }

    public static S1 getAddress(){
        return address;
    }

    public static void main(String[] args) {
        S1 a=S1.getAddress();
        S1 b=S1.getAddress();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
