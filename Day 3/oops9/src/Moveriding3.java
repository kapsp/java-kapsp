class neymar{
    protected void Age(){
        System.out.println("AGE IS 39");
    }
}

class neymarjr extends neymar{
    public void Age(){
        System.out.println("Age is 16");
    }
}



public class Moveriding3 {
    public static void main(String[] args) {
        neymarjr a= new neymarjr();
        a.Age();
    }
}
