public class Employee {
    private int employeeId;
    private double salary;

    // Constructor with validation
    public Employee(int employeeId, double salary) {
        // Validate employee ID
        if (employeeId <= 0) {
            throw new IllegalArgumentException("Employee ID must be a positive integer.");
        }

        // Validate salary
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be a positive number.");
        }

        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        try {
            // Valid employee creation
            Employee emp1 = new Employee(101, 50000);
            emp1.showEmployeeDetails();

            // Invalid employee creation with negative salary
            Employee emp2 = new Employee(102, -5000); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Invalid employee creation with invalid employeeId
            Employee emp3 = new Employee(0, 60000); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
