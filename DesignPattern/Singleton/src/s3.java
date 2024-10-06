public class s3 {
    //lazy way
    private static  s3 kapil;

    private s3(){

    }
    private static synchronized s3 getKapil(){
        if(kapil==null){
            kapil=new s3();
        }
        return kapil;
    }

    public static void main(String[] args) {
        s3 a=s3.getKapil();
        System.out.println(a.hashCode());
        s3 b=s3.getKapil();
        System.out.println(b.hashCode());
    }
}
