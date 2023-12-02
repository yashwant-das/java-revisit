public class TernaryOperatorExample {
    public static void main(String[] args) {
        int number = 10;

        // Using the ternary operator to assign a value to a variable
        String result = (number > 0) ? "Positive" : "Non-positive";

        // Displaying the result
        System.out.println("The number is " + result);

        // Another example using the ternary operator within a print statement
        int x = 15;
        int y = 20;
        System.out.println("The larger number is: " + ((x > y) ? x : y));
    }
}
