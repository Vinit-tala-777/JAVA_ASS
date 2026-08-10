class StudentObj {
    String name;
    int age;

    StudentObj getStudent() {
        StudentObj s = new StudentObj();

        s.name = "Vinit";
        s.age = 22;

        return s;
    }

    public static void main(String[] args) {

        StudentObj obj = new StudentObj();

        StudentObj result = obj.getStudent();

        System.out.println("Student Name : " + result.name);
        System.out.println("Student Age  : " + result.age);
    }
}