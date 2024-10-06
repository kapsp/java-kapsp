public class create {
    public static void main(String[] args) {
        footballer x=new footballer.player().name("ronaldo").goals(920).assists(400).build();
        footballer y=new footballer.player().name("messi").build();
        System.out.println(x);
        System.out.println(y);
    }
}
