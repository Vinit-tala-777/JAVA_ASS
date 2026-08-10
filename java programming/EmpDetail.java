// Define the Employee class
class Employee {
    int employeeID;
    String name;
    String designation;
    double salary;

    
    void display() {
        System.out.println("ID: " + employeeID + " | Name: " + name + " | Role: " + designation + " | Salary: ₹" + salary);
    }
}

// Main class to run the program
public class EmpDetail {
    public static void main(String[] args) {
        // Create the first Employee object
        Employee emp1 = new Employee();
        emp1.employeeID = 101;
        emp1.name = "Amit Patel";
        emp1.designation = "Software Engineer";
        emp1.salary = 65000.0;

        // Create the second Employee object
        Employee emp2 = new Employee();
        emp2.employeeID = 102;
        emp2.name = "Priya Sharma";
        emp2.designation = "Project Manager";
        emp2.salary = 95000.0;

        // Display details for both objects
        System.out.println("=== Employee Details ===");
        emp1.display();
        emp2.display();
    }
}
