public class StaticMethodExample {
    // Static variable
    static int staticVariable = 10;

    // Static method
    static void printStaticVariable() {
        System.out.println("Static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        // Calling static method using the class name
        StaticMethodExample.printStaticVariable();

        // Creating instances of StaticMethodExample
        StaticMethodExample obj1 = new StaticMethodExample();
        StaticMethodExample obj2 = new StaticMethodExample();

        // Accessing static variable through instances (not recommended)
        System.out.println("Static variable value from obj1: " + obj1.staticVariable);
        System.out.println("Static variable value from obj2: " + obj2.staticVariable);
    }
}
