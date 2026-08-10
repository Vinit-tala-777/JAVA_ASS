class StudentCmp {
    String name;
    int marks;

    void compare(StudentCmp s) {
        if (marks > s.marks) {
            System.out.println(name + " has higher marks.");
        } 
        else if (marks < s.marks) {
            System.out.println(s.name + " has higher marks.");
        } 
        else {
            System.out.println("Both students have equal marks.");
        }
    }

    public static void main(String[] args) {

        StudentCmp s1 = new StudentCmp();
        s1.name = "Vinit";
        s1.marks = 85;

        StudentCmp s2 = new StudentCmp();
        s2.name = "Rahul";
        s2.marks = 78;

        s1.compare(s2);
    }
}