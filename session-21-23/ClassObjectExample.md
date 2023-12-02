# Let's create a simple example to illustrate the concepts of a class and an object in Java:

```java
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
public class Main {
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
```

In this example:

- We have a class named `Person` with attributes (or fields) `name` and `age`, and a constructor to initialize these attributes.
- The `displayInfo` method is a member method of the class that prints information about the person.
- In the `Main` class, we create two objects (`person1` and `person2`) of the `Person` class using the `new` keyword.
- We access the attributes and invoke the `displayInfo` method for each person, demonstrating the concept of objects and how they encapsulate data and behavior.

When you run this program, you'll see output displaying the details of each person:

```bash
Details of Person 1:
Name: John Doe
Age: 25

Details of Person 2:
Name: Jane Smith
Age: 30
```

This example showcases the fundamental concepts of classes and objects in Java, where a class serves as a blueprint, and objects are instances of that blueprint with specific attribute values.