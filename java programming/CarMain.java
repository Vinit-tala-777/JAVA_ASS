// Blueprint Class
class Car {
    String brand;
    String model;
    int year;
    double price;

    Car(String b, String m, int y, double p) {
        brand = b;
        model = m;
        year = y;
        price = p;
    }
    

    void display() {
        System.out.println(brand + " " + model + " " + year + " " + price);
    }
}

// Running Class
class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022, 26000);
        Car car2 = new Car("Honda", "Civic", 2023, 25000);

        car1.display();
        car2.display();
    }
}
