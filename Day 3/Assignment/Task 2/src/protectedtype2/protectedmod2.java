package protectedtype2;

import Protectedtype.petname;
public class protectedmod2 extends petname {
    public void acessp(){
        System.out.println(dog);
    }

    public static void main(String[] args) {
        protectedmod2 a=new protectedmod2();
        a.acessp();
    }
}
