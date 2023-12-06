class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object to Animal reference
        Animal animal = new Dog();

        // Accessing the common method from Animal
        animal.eat();

        // This line would result in a compilation error since
        // the reference is of type Animal, and 'bark' is not
        // a method of the Animal class.
        // animal.bark();
    }
}
