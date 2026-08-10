public class MathClass {
    
    public static void main(String[] args) {
        // 1. Square Root
        System.out.println("Square root of 16: " + Math.sqrt(16));

        // 2. Power (2 raised to 3)
        System.out.println("2 power 3: " + Math.pow(2, 3));

        // 3. Maximum
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));

        // 4. Minimum
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));

        // 5. Random number between 1 and 10
        int randomNum = (int)(Math.random() * 10) + 1;
        System.out.println("Random number (1-10): " + randomNum);
    }
}

