import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Office implements Serializable {
    int officeId;
    String officeName;

    Office(int officeId, String officeName) {
        this.officeId = officeId;
        this.officeName = officeName;
    }

    @Override
    public String toString() {
        return "Office [officeId=" + officeId + ", officeName=" + officeName + "]";
    }
}

class Employee extends Office {
    String department;
    int salary;

    public Employee(int officeId, String officeName, String department, int salary) {
        super(officeId, officeName);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [department=" + department + ", salary=" + salary + ", officeId=" + officeId
                + ", officeName=" + officeName + "]";
    }
}

public class Serialization {
    public static void main(String args[]) {
        try {
            Employee e1 = new Employee(101, "Headquarters", "IT", 75000);
            FileOutputStream fout = new FileOutputStream("file.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(e1);
            out.flush();
            out.close();
            System.out.println("Data written in file successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
            Employee e = (Employee) in.readObject();
            System.out.println(e);
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

