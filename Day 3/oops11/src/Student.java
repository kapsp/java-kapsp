public class Student {
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
     public String getName(){
        return name;
     }

    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Student a=new Student("kapil",25);
        Student b=new Student("soham",24);
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }
}
