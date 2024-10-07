import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class r1 {

    public String name;
    private String club;

    protected String league;

    public r1(){}

    public r1(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setClub(String club){
        this.club=club;
    }

    public void setLeague(String league){
        this.league=league;
    }

    private void privateInformation() {
        System.out.println("private information can not accessible outside the class.");
    }

    public String getInfo(){
        return name +" is the name and club is "+club+" and league he plays in "+league;
    }

    public static void main(String[] args) {
        r1 a=new r1();
        Class obj=a.getClass();
        Method[] m=obj.getDeclaredMethods();
        for(Method M:m){
            System.out.println("Method name "+M.getName());
            int modifier=M.getModifiers();
            System.out.println("Modifier "+Modifier.toString(modifier));
            System.out.println(" Return type"+M.getReturnType());
        }
    }
}
