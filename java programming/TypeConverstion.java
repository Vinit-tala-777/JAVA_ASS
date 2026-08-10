public class TypeConverstion {
    public static void main(String[] args) {
        // Larger to smaller 
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual cast

        // Smaller to larger 
        int num = 5;
        double data = num; // Automatic cast

        System.out.println("Double to Int: " + myInt);
        System.out.println("Int to Double: " + data);
    }
}
