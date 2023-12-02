public class StaticVariableExample {
    // Static variable
    static int staticVariable = 10;

    public static void main(String[] args) {
        // Accessing static variable directly using the class name
        System.out.println("Static variable value: " + StaticVariableExample.staticVariable);

        // Creating instances of StaticVariableExample
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();

        // Changing the static variable through one instance
        StaticVariableExample.staticVariable = 20;

        // Accessing static variable through the other instance
        System.out.println("Static variable value from obj2: " + StaticVariableExample.staticVariable);
    }
}
