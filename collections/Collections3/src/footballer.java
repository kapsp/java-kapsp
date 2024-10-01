public class footballer {
    private String name;
    private int goals;

    public footballer(String name,int goals){
        this.name=name;
        this.goals=goals;
    }

    public int getGoals(){
        return goals;
    }

    public String getNmae(){
        return name;
    }

    public String toString(){
        return "name is "+name+" and goals scored are "+goals;
    }
}
