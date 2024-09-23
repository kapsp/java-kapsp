public class inter2 {
    public static void main(String[] args) {
       living a=new living();
       a.mammals();
       a.birds();
       a.bulba();
       a.trex();
    }
}

interface animal{
    void mammals();
    void birds();
}

interface dino{
    void trex();
    void bulba();
}

class living implements animal,dino{
    public void mammals(){
        System.out.println("Land");
    }
    public void birds(){
        System.out.println("sky");
    }

    public void trex(){
        System.out.println("dangerous");
    }
    public void bulba(){
        System.out.println("grass type");
    }
}
