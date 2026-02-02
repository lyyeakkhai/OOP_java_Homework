class Main {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello! This is a basic Java program.");

        // Declare variables
        int number = 10;
        String name = "Khai";

        // Conditional statement
        if (number > 5) {
            System.out.println(name + ", the number is greater than 5.");
        } else {
            System.out.println(name + ", the number is 5 or less.");
        }

        // Loop: Print numbers from 1 to 5
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Call a method
        int sum = addNumbers(5, 7);
        System.out.println("Sum of 5 and 7 is: " + sum);
    }

    // Simple method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
