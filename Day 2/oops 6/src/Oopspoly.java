public class Oopspoly {
    private String footballerName;
    private int goals;

    public void changeData(String footballerName,int goals){
        this.footballerName=footballerName;
        this.goals=goals;
    }
    public void changeData(int goals){

        this.goals=goals;
    }
    public void changeData(String footballerName){
        this.footballerName=footballerName;

    }

    public void display(){
        System.out.println(footballerName);
        System.out.println(goals);
    }



    public static void main(String[] args) {
        Oopspoly foot=new Oopspoly();
        foot.changeData(400);
        foot.display();
    }
}
