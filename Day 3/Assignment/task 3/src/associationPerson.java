//Define a class Person with private attributes name and age. Provide public methods getName(),
//setName(), getAge(),and setAge() to access and modify these attributes using association from main class.

class person{
private String name;
private int age;

person(String name,int age ){
    this.name=name;
    this.age=age;

}
public String getName(){
    return name;
}
public int getAge(){
    return age;
}

public void setName(String name){
    this.name=name;
}
public void setAge(int age){
    this.age=age;
}
}


public class associationPerson {
    private person a;

    associationPerson(person a){
        this.a=a;
    }

    public void display(){
        System.out.println("name is "+a.getName());
        System.out.println("age is "+ a.getAge());

    }
    public void change(String name, int age){
        a.setAge(age);
        a.setName(name);
    }

    public static void main(String[] args) {
        person a=new person("kapil",26);

        associationPerson b=new associationPerson(a);

        b.display();
        b.change("soham",26);
        b.display();

    }




}
