public class E5 {
    enum fauna2{
        plants(12),trees(8),animals(2),flowes(20);
        int total;
        fauna2(int total){
            this.total=total;
        }
    }

    public static void main(String[] args) {
        fauna2[] a=fauna2.values();
        for(fauna2 s:a){
            System.out.println(s+":"+s.total);
        }
    }
}