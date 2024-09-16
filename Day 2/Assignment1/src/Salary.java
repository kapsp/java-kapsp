//Develop a Java program to process a list of employees.
//Use instance methods to calculate their salary based on after 10% of tax deduction.

public class Salary {
    private int salary;
    private String name;

    public void data(int salary,String name){
        this.salary=salary;
        this.name=name;
    }

    public double tax(){
         double t=salary-(salary*0.10);
         return t;
    }

    public static void main(String[] args) {
        Salary e=new Salary();
        Salary e2=new Salary();

        e.data(75000,"kapil");
        e2.data(78000,"kaps");

        System.out.println(e.tax());
        System.out.println(e2.tax());
    }
}
