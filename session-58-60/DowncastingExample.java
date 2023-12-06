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

public class DowncastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object to Animal reference
        Animal animal = new Dog();

        // Downcasting: Animal reference to Dog reference
        Dog dog = (Dog) animal;

        // Accessing methods from Dog class
        dog.eat();
        dog.bark();
    }
}
