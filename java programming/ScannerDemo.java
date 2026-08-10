import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

         System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

         System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("num1 :-" + num1);
        System.out.println("num2 :-" + num2);
    }
}
