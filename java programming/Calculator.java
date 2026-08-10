
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs from the user
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        // Perform and display operations
        System.out.println("Addition (+):        " + (num1 + num2));
        System.out.println("Subtraction (-):     " + (num1 - num2));
        System.out.println("Multiplication (*):  " + (num1 * num2));
        System.out.println("Division (/):        " + (num1 / num2));
        System.out.println("Remainder (%):       " + (num1 % num2));
    }
}
