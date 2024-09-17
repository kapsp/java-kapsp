public class staticBlock {
    private static int trees;

    static{
        trees=45;
        System.out.println("total number of trees are ");

    }

    public static int t(){
        return trees;
    }
    public static void main(String[] args) {
        System.out.println(staticBlock.t());
    }
}
