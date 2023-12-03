// First interface
interface Animal {
    void eat();
}

// Second interface
interface Mammal {
    void giveBirth();
}

// Concrete class implementing both interfaces
class Dog implements Animal, Mammal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void giveBirth() {
        System.out.println("Dog gives birth to puppies");
    }

    // Additional method specific to Dog
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the class
        Dog myDog = new Dog();

        // Call methods from both interfaces and the class
        myDog.eat(); // Inherited from Animal interface
        myDog.giveBirth(); // Inherited from Mammal interface
        myDog.bark(); // Specific to Dog class
    }
}
