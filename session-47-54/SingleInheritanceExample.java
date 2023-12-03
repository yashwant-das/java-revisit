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
        myDog.eat(); // Inherited from Animal
        myDog.bark(); // Specific to Dog
    }
}
