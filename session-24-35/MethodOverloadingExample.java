public class MethodOverloadingExample {

    // Method with two integer parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the overloaded methods
        int result1 = add(5, 3);
        int result2 = add(2, 4, 6);
        double result3 = add(2.5, 3.5);

        // Printing the results
        System.out.println("Sum (int): " + result1);
        System.out.println("Sum (int): " + result2);
        System.out.println("Sum (double): " + result3);
    }
}
