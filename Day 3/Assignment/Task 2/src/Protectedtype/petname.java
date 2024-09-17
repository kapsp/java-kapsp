package Protectedtype;

public class petname extends protectedmod {
    protected void access(){
        System.out.println(dog);
    }

    public static void main(String[] args) {
        petname a=new petname();
        a.access();
    }
}
