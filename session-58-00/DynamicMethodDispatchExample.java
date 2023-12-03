// Base class
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Dynamic Method Dispatch
        // The actual method called is determined at runtime based on the type of the
        // object.
        myDog.makeSound(); // Calls the makeSound method of Dog: Woof
        myCat.makeSound(); // Calls the makeSound method of Cat: Meow
    }
}
