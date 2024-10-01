public class E4 {
    enum fauna{
        plants,trees,animals,flowes
    }

    public static void main(String[] args) {
        for(fauna s:fauna.values()){
            System.out.println(s.ordinal());
        }
    }
}
