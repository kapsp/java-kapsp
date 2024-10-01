public class E6 {
    enum fauna3{
        plants(12),trees(8),animals(2),flowes(20);
        int total;

        static String country;
        fauna3(int total){
            this.total=total;
        }

        String printdetails(){
            return "country is "+country+" and number is "+total;
        }


        static {
            country="india";
        }

    }

    public static void main(String[] args) {
        fauna3[] a=fauna3.values();
        
        for(fauna3 s:a){
            System.out.println(s+":"+s.total);
            System.out.println(s.printdetails());
        }


    }
}