class MobileDetails {
    String brand;
    int ram;
    int storage;
    double price;

    void display() {
        System.out.println("Brand   : " + brand);
        System.out.println("RAM     : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
        System.out.println("Price   : Rs. " + price);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        MobileDetails mobile1 = new MobileDetails();
        mobile1.brand = "Samsung";
        mobile1.ram = 8;
        mobile1.storage = 128;
        mobile1.price = 29999;

        MobileDetails mobile2 = new MobileDetails();
        mobile2.brand = "OnePlus";
        mobile2.ram = 12;
        mobile2.storage = 256;
        mobile2.price = 39999;

        MobileDetails mobile3 = new MobileDetails();
        mobile3.brand = "Apple";
        mobile3.ram = 8;
        mobile3.storage = 128;
        mobile3.price = 69999;

        mobile1.display();
        mobile2.display();
        mobile3.display();
    }
}