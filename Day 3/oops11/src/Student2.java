public class Student2 {
    private String name2;
    private int age2;
    public Student2(String name2,int age2){
        this.name2=name2;
        this.age2=age2;
    }
    public String getName2(){
        return name2;
    }

    public int getAge2(){
        return age2;
    }
    public static void main(String[] args) {
        Student2 a=new Student2("kapil",25);
        Student2 b=new Student2("soham",24);
        System.out.println(b.getAge2());
        System.out.println(b.getName2());
    }
}
