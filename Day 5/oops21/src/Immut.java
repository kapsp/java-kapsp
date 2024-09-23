public class Immut {
    public static void main(String[] args) {
        IPC a=new IPC("indian penal code",5,1951);
        System.out.println(a);
    }

}

final class IPC{
    private final String Laws;
    private final int sections;

    private final int initial_year;

    IPC(String Laws,int sections,int initial_year){
        this.Laws=Laws;
        this.sections=sections;
        this.initial_year=initial_year;
    }

    public String toString(){
        return "IPC[indian law is called "+Laws+" and it has total "+sections+" sections and it started on "+initial_year+"]";
    }
}
