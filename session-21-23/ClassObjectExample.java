// Define a class named "Person"
class Person {
    // Class members (attributes)
    String name;
    int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class ClassObjectExample {
    public static void main(String[] args) {
        // Create an object of the class "Person"
        Person person1 = new Person("John Doe", 25);

        // Accessing object members and invoking methods
        System.out.println("Details of Person 1:");
        person1.displayInfo();

        // Create another object of the class "Person"
        Person person2 = new Person("Jane Smith", 30);

        // Accessing object members and invoking methods for the second person
        System.out.println("\nDetails of Person 2:");
        person2.displayInfo();
    }

}
