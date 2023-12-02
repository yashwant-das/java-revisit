public class StaticBlockExample {

    // Static variable
    static int count;

    // Static block
    static {
        System.out.println("This is a static block.");
        // Perform any one-time initialization tasks
        count = 100;
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // Access the static variable
        System.out.println("Static variable count: " + count);

        // Create an instance of the class
        StaticBlockExample obj = new StaticBlockExample();

        // Call the instance method
        obj.instanceMethod();
    }
}
