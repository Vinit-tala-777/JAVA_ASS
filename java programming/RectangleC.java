class Rectangle {
    double length;
    double width;

    // Method to calculate and print area and perimeter
    void calculate() {
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

public class RectangleC{
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle();

        // Assign values
        rect.length = 12.5;
        rect.width = 5.0;

        // Display calculations
        rect.calculate();
    }
}
