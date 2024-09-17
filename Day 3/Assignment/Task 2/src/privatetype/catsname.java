package privatetype;

public class catsname {
    private String catname="laura";

    private void show(){
        System.out.println(catname);
    }
    public void show2(){
        System.out.println(catname);
    }

    public static void main(String[] args) {
        catsname a=new catsname();
        a.show();
    }
}
