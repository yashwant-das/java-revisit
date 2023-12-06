# In Java, the `abstract` keyword is used to declare abstract classes and abstract methods. Let's discuss both concepts

1. **Abstract Class:**
   - An **abstract class** is a class that cannot be instantiated on its own and is meant to be subclassed by other classes. It may contain abstract methods (methods without a body) as well as concrete methods.
   - Abstract classes are declared using the `abstract` keyword.

   ```java
   abstract class Shape {
       // Abstract method (no implementation)
       abstract void draw();

       // Concrete method with implementation
       void display() {
           System.out.println("Displaying the shape");
       }
   }
   ```

   - Abstract classes can have both abstract methods and concrete methods. Subclasses of an abstract class must provide implementations for all abstract methods unless they are abstract themselves.

2. **Abstract Method:**
   - An **abstract method** is a method declared without an implementation in the abstract class. It is meant to be implemented by concrete subclasses.
   - Abstract methods are declared using the `abstract` keyword and do not have a method body.

   ```java
   abstract class Animal {
       // Abstract method (no implementation)
       abstract void makeSound();
   }
   ```

   - Subclasses of `Animal` must provide an implementation for the `makeSound` method.

### Example

Here's an example that demonstrates the use of the `abstract` keyword with an abstract class and an abstract method:

```java
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
        myDog.makeSound();  // Calls the overridden method in Dog
        myDog.sleep();      // Calls the inherited method from Animal
    }
}
```

In this example, `Animal` is an abstract class with an abstract method `makeSound`. The `Dog` class extends `Animal` and provides an implementation for the `makeSound` method. The `AbstractExample` class demonstrates creating an instance of `Dog` and calling both abstract and concrete methods.
