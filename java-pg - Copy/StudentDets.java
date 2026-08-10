class StudentDets {
    String name;
    int age;

    void display(StudentDets s) {
        System.out.println("Student Name : " + s.name);
        System.out.println("Student Age  : " + s.age);
    }

    public static void main(String[] args) {

        StudentDets s1 = new StudentDets();

        s1.name = "Vinit";
        s1.age = 22;

        StudentDets s2 = new StudentDets();

        s2.display(s1);
    }
}