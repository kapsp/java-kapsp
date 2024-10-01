//Create a class Employee with attributes employeeId and salary.
//Implement a constructor that validates input parameters
//        (e.g., positive salary) and throws an exception for invalid values.

public class Task5 {
    public static void main(String[] args) {
        try{
            Emp a=new Emp(0,45000);
            a.print();
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }

        try{
            Emp b=new Emp(2,100000);
            b.print();
            Emp c=new Emp(3,-89990);
            c.print();
        }catch (IllegalArgumentException e){

            System.out.println(e);
        }



    }
}

class Emp{
    int empId;
    int salary;

    Emp(int empId,int salary) throws IllegalArgumentException{
        if (empId<=0){
            throw new IllegalArgumentException("Id cannot be zero or in negative");

        }
        if (salary<=0){
            throw new IllegalArgumentException("salary cannot be negative");

        }
        this.empId=empId;
        this.salary=salary;
    }

    void print(){
        System.out.println("the employee "+empId+" has salary of "+salary);
    }

}