class Calculator {

    void addition(int a, int b) {
        System.out.println("Addition       : " + (a + b));
    }

    void subtraction(int a, int b) {
        System.out.println("Subtraction    : " + (a - b));
    }

    void multiplication(int a, int b) {
        System.out.println("Multiplication : " + (a * b));
    }

    void division(int a, int b) {
        System.out.println("Division       : " + (a / b));
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.addition(20, 10);
        c.subtraction(20, 10);
        c.multiplication(20, 10);
        c.division(20, 10);
    }
}