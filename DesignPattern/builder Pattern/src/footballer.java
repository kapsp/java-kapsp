public class footballer {

    private final String name;
    private final int goals;
    private final int assists;

    private footballer(player z){
        this.name=z.name;
        this.goals=z.goals;
        this.assists=z.assists;

    }

    public String getname(){
        return name;
    }

    public int getgoals(){
        return goals;

    }

    public int getassists(){
        return assists;
    }

    public String toString(){
        return "football player is "+name+" he scored "+goals+" goals and provided "+assists+" assists";
    }

    public static class player{
        private String name;
         private int goals;
         private int assists;

         public player name(String Name){
              this.name=Name;
              return this;
         }

         public player goals(int goals){
             this.goals=goals;
             return this;
         }

         public player assists(int assists){
             this.assists=assists;
             return this;
         }

         public footballer build(){
             footballer a=new footballer(this);
             return a;
         }

    }

}
