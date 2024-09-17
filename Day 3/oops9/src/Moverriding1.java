class ronaldo{
    public void Age(){
        System.out.println("AGE IS 39");
    }
}

class Jr extends ronaldo{
    public void Age(){
        System.out.println("Age is 16");
    }
}

public class Moverriding1 {
    public static void main(String[] args) {
        Jr a= new Jr();
        a.Age();
    }
}
