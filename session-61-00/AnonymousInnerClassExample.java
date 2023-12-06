interface Greet {
    void sayHello();
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        // Creating an anonymous inner class implementing the Greet interface
        Greet greet = new Greet() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous inner class");
            }
        };

        // Calling the method defined in the interface
        greet.sayHello();
    }
}
