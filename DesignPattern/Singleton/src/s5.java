public class s5 {

    private s5(){}

    private static class room{
        private static final s5 house=new s5();
    }

    public static s5 gethome(){
        return room.house;
    }

    public static void main(String[] args) {
        s5 a=s5.gethome();
        System.out.println(a.hashCode());
        s5 b=s5.gethome();
        System.out.println(b.hashCode());
    }
}
