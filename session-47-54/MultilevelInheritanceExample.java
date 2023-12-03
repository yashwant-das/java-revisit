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
        myPuppy.eat(); // Inherited from Animal
        myPuppy.bark(); // Inherited from Dog
        myPuppy.wagTail(); // Specific to Puppy
    }
}
