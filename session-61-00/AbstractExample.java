abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    // Implementation of the abstract method
    @Override
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog myDog = new Dog();

        // Calling abstract and concrete methods
        myDog.makeSound(); // Calls the overridden method in Dog
        myDog.sleep(); // Calls the inherited method from Animal
    }
}
