

// Define the Student class
class Student 
{
    int studentID;
    String name;

    // Method to display student details
    void display() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + name);
    }
}
    
public class StudentDetail 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();

        // Assign values to the object variables
        s1.studentID = 101;
        s1.name = "Rahul Sharma";

        // Display the details using the method
        s1.display();
    }
}
