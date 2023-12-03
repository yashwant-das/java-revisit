# Dynamic Method Dispatch is a mechanism in Java where the method to be called is determined at runtime rather than at compile time. This is a key feature of polymorphism, allowing a reference variable of a superclass type to refer to an object of a subclass type and invoke the overridden method of the subclass

Here's a simple example to illustrate Dynamic Method Dispatch:

```java
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
        // The actual method called is determined at runtime based on the type of the object.
        myDog.makeSound();  // Calls the makeSound method of Dog: Woof
        myCat.makeSound();  // Calls the makeSound method of Cat: Meow
    }
}
```

In this example:

- The `Animal` class has a method `makeSound`.
- The `Dog` and `Cat` classes are subclasses of `Animal` and override the `makeSound` method.
- In the `main` method, we create objects of `Dog` and `Cat` but use reference variables of type `Animal` to refer to them.
- When we call `makeSound` on these objects, the actual method called is determined at runtime based on the actual type of the object. This is dynamic method
