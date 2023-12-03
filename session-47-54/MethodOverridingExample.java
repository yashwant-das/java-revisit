// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass overriding the makeSound method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog myDog = new Dog();

        // Call the overridden method
        myDog.makeSound(); // This will call the specific implementation in Dog
    }
}
