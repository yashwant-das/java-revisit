# In Java, you can create an array of objects, where each element of the array is an instance of a class. Here's an example

```java
// Define a simple class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ArrayOfObjectsExample {

    public static void main(String[] args) {
        // Declare and initialize an array of Person objects
        Person[] people = new Person[3];

        // Create individual Person objects and assign them to array elements
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 22);

        // Access and print values from the array of objects
        System.out.println("Person at index 1: " + people[1].name + ", Age: " + people[1].age);

        // Iterate through the array of objects and print their information
        System.out.println("Printing information of all people:");
        for (Person person : people) {
            System.out.println("Name: " + person.name + ", Age: " + person.age);
        }
    }
}
```

In this example:

- We define a simple `Person` class with two attributes (`name` and `age`) and a constructor.
- We declare and initialize an array of `Person` objects named `people`.
- We create individual `Person` objects and assign them to elements of the array.
- We access and print values from the array of objects using index notation.
- We use an enhanced for loop to iterate through the array of objects and print their information.

This concept is particularly useful when you want to store a collection of objects of the same type in an array. Each element of the array is an instance of the specified class.

Feel free to ask if you have any questions or if you'd like more examples!
