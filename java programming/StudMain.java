class Student {
    String name = "Rahul";
    // Marks for 5 subjects out of 100 each
    double m1 = 85, m2 = 78, m3 = 92, m4 = 65, m5 = 88;

    void calculateResult() {
        double total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5;
        
        char grade;
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 50) grade = 'C';
        else grade = 'D';

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks : " + total + " / 500");
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);
    }
}

public class StudMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.calculateResult();
    }
}
