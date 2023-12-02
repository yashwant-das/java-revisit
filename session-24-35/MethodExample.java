public class MethodExample {

    // This is a simple method that prints a message
    static void printMessage() {
        System.out.println("Hello, I am a method!");
    }

    // This method takes two parameters and returns their sum
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the printMessage method
        printMessage();

        // Calling the add method and storing the result in a variable
        int result = add(5, 3);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
