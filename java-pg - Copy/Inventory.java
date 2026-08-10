import java.util.Scanner;

class Inventory {

    int id;
    String name;
    int quantity;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory p = new Inventory();

        System.out.println("1. Add Product");
        System.out.println("2. Display Product");
        System.out.println("3. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter ID: ");
            p.id = sc.nextInt();

            System.out.print("Enter Name: ");
            p.name = sc.next();

            System.out.print("Enter Quantity: ");
            p.quantity = sc.nextInt();

            System.out.println("Product Added!");

        } else if (choice == 2) {

            p.display();

        } else if (choice == 3) {

            System.out.println("Exit");

        } else {

            System.out.println("Invalid choice");
        }
    }
}