class production{
String title;
    public production(String title){
        this.title=title;

    }

    public production(){

    }


}

public class Album extends production {
    private String song;
    private String SingerName;
    private float duration;

    public Album(String song,String SingerName){
        this.song=song;
        this.SingerName=SingerName;
        this.duration=duration;
    }
    public Album(String song,float duration){
        this(4.0f);


        this.song=song;
        this.SingerName=SingerName;

    }
    public Album(float duration){
           super("t series");
        this.duration=duration;

    }
    public void print(){
        System.out.println("title is  "+title);
    }

    public static void main(String[] args) {
      Album a =new Album("dance",4);
        System.out.println(a.duration);
        System.out.println(a.song);
        Album b =new Album(4);
        System.out.println(b.duration);
        b.print();

    }
}
