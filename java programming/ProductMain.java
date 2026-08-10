class Product {
    int id;
    String name;
    double price;
    int quantity;
    // Method to calculate total cost for this specific product
    double getTotalCost() {
        return price * quantity;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        // Create Product 1
        Product p1 = new Product();
        p1.id = 101;
        p1.name = "Laptop";
        p1.price = 45000.0;
        p1.quantity = 2;

        // Create Product 2
        Product p2 = new Product();
        p2.id = 102;
        p2.name = "Mouse";
        p2.price = 500.0;
        p2.quantity = 3;

        // Calculate and display individual costs
        System.out.println(p1.name + " Cost: " + p1.getTotalCost());
        System.out.println(p2.name + " Cost: " + p2.getTotalCost());
        //  grand bill
        double grandTotal = p1.getTotalCost() + p2.getTotalCost();
        System.out.println("\nGrand Total Bill: " + grandTotal);
    }
}
