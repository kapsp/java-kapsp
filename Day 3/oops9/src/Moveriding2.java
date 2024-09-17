class messi{
    public void Age(){
        System.out.println("AGE IS 39");
    }
}

class messiJr extends messi{
    public void Age(){
        System.out.println("Age is 16");
    }
    public void accessDad(){
        super.Age();
    }
}


public class Moveriding2 {
    public static void main(String[] args) {
        messiJr a= new messiJr();
        a.Age();
        a.accessDad();
    }
}
