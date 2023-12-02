public class StaticVariableExample {

    // Static variable
    static int count = 0;

    // Instance variable
    int instanceCount;

    // Constructor
    public StaticVariableExample() {
        // Increment both the static variable and the instance variable
        count++;
        instanceCount++;
    }

    public static void main(String[] args) {
        // Create instances of the class
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        // Display the values of static and instance variables
        System.out.println("Static variable count: " + count);
        System.out.println("Instance variable of obj1: " + obj1.instanceCount);
        System.out.println("Instance variable of obj2: " + obj2.instanceCount);
        System.out.println("Instance variable of obj3: " + obj3.instanceCount);
    }
}
