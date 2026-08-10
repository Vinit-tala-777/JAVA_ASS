class Circle {
    double radius;

    // Method to calculate and print area and circumference
    void calculate() {
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference of Circle: " + circumference);
        System.out.println("Area of Circle: " + area);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        // Create a Circle object
        Circle obj = new Circle();

        // Assign radius value
        obj.radius = 7.0;

        // Display calculations
        obj.calculate();
    }
}
