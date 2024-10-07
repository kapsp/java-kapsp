interface zoo{
    void animal();

    default void animaldef(){
        System.out.println("contains animals");
    }

}

class aquariam implements zoo{
   public void animal(){
       System.out.println("contains water type animals");
    }
}

public class d1 {
    public static void main(String[] args) {
        zoo a=new aquariam();
        a.animal();
        a.animaldef();
    }
}
