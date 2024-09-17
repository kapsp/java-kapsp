//Task 5: Employee Management System: Build a system with classes Employee, Manager, Developer,
//and Intern. Implement inheritance where Manager and Developer inherit from Employee.
//Use method overriding for any specific
//functionalities.

class Employee{
    String name;
 int salary;

    public Employee(){}
    public Employee(String name,int salary){
            this.name=name;
            this.salary=salary;
    }

    public void display(){
        System.out.println("employee name is  "+name +" "+salary );
    }
}
class Manager extends Employee{
    private int juniorsUnder;
    public Manager(String name,int salary,int juniorsunder){
        super(name,salary);
        this.juniorsUnder=juniorsunder;
    }
    public void display(){
        System.out.println(name+""+salary+""+juniorsUnder);
    }
}

class developer extends Employee{
    private int experience;
    public developer(String name,int salary,int experience){
        super(name,salary);
        this.experience=experience;
    }
    public void display(){
        System.out.println(name+""+salary+""+experience);
    }
}


public class Ems {
    public static void main(String[] args) {
        Employee a=new Employee("kapil",70000);
        Manager b=new Manager("kaps",80000,5);
        developer c=new developer("kap",100000,3);
        a.display();
        b.display();
        c.display();
    }
}
