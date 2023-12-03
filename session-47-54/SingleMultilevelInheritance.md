# In Java, inheritance allows for the creation of a hierarchy of classes, and two common types of inheritance are single inheritance and multilevel inheritance

## Single Inheritance

Single inheritance is a type of inheritance in which a class can inherit properties and behaviors from only one superclass. In other words, a class can have only one immediate parent class.

Here's a simple example of single inheritance:

```java
// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog myDog = new Dog();

        // Call methods from both the superclass and subclass
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Specific to Dog
    }
}
```

In this example, the `Dog` class inherits from the `Animal` class, forming a single inheritance relationship. The `Dog` class can access the `eat` method from the `Animal` class, in addition to its own method `bark`.

## Multilevel Inheritance

Multilevel inheritance is a type of inheritance in which a class can inherit from another class, and then another class can inherit from that class, forming a chain of inheritance.

Here's an example of multilevel inheritance:

```java
// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class inheriting from Dog
class Puppy extends Dog {
    void wagTail() {
        System.out.println("Puppy is wagging its tail");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the child class
        Puppy myPuppy = new Puppy();

        // Call methods from all levels of the inheritance hierarchy
        myPuppy.eat();    // Inherited from Animal
        myPuppy.bark();   // Inherited from Dog
        myPuppy.wagTail(); // Specific to Puppy
    }
}
```

In this example, the `Puppy` class inherits from the `Dog` class, which, in turn, inherits from the `Animal` class. This forms a chain of inheritance, allowing the `Puppy` class to access methods from all levels of the hierarchy.

Both single and multilevel inheritance provide mechanisms for code reuse and building a hierarchy of classes based on their relationships. However, it's essential to use inheritance judiciously to avoid creating overly complex or tightly coupled class hierarchies.
