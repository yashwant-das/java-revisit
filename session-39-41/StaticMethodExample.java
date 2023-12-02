public class StaticMethodExample {

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // Call the static method without creating an instance
        StaticMethodExample.staticMethod();

        // Create an instance of the class
        StaticMethodExample obj = new StaticMethodExample();

        // Call the instance method using the instance
        obj.instanceMethod();

        // It is also possible to call a static method using an instance, but it is not
        // recommended
        // obj.staticMethod();
        StaticMethodExample.staticMethod();
    }
}
