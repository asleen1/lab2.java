package exercise3;

public class OverloadedMethods {

    // Overloaded static method 1 - adds two integers
    public static int operate(int a, int b) {
        return a + b;
    }

    // Overloaded static method 2 - adds three integers
    public static int operate(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded static method 3 - multiplies two doubles
    public static double operate(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Call the overloaded methods and display the results
        int sumTwoIntegers = operate(5, 10);  // Using the first method
        int sumThreeIntegers = operate(1, 2, 3);  // Using the second method
        double productTwoDoubles = operate(2.5, 4.0);  // Using the third method

        // Display the results
        System.out.println("Sum of two integers: " + sumTwoIntegers);  // 5 + 10 = 15
        System.out.println("Sum of three integers: " + sumThreeIntegers);  // 1 + 2 + 3 = 6
        System.out.println("Product of two doubles: " + productTwoDoubles);  // 2.5 * 4.0 = 10.0
    }
}
