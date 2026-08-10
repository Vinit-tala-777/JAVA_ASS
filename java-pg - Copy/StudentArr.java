class StudentArr {
    int rollNo;
    String name;
    int age;

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        StudentArr[] students = new StudentArr[3];

        students[0] = new StudentArr();
        students[0].rollNo = 101;
        students[0].name = "Vinit";
        students[0].age = 22;

        students[1] = new StudentArr();
        students[1].rollNo = 102;
        students[1].name = "Rahul";
        students[1].age = 21;

        students[2] = new StudentArr();
        students[2].rollNo = 103;
        students[2].name = "Amit";
        students[2].age = 23;

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}