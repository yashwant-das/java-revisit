// Superclass (Base class)
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass (Derived class)
class Dog extends Animal {
    // Additional field specific to Dog
    String breed;

    // Constructor
    public Dog(String name, String breed) {
        // Call the constructor of the superclass using "super"
        super(name);
        this.breed = breed;
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method specific to Dog
    public void wagTail() {
        System.out.println(name + " is wagging its tail.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", "Labrador");

        // Access fields and methods from both Animal and Dog
        System.out.println("Name: " + myDog.name);
        myDog.makeSound(); // Calls the overridden method in Dog
        myDog.wagTail(); // Calls the method specific to Dog
    }
}
