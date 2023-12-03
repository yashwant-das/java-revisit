// Parent class
class Animal {
    protected String sound;

    // Parameterized constructor
    public Animal(String sound) {
        this.sound = sound;
    }

    // Method to make the animal sound
    public void makeSound() {
        System.out.println("Generic animal sound: " + sound);
    }
}

// Child class extending the Parent class
class Cat extends Animal {
    private String breed;

    // Parameterized constructor for Cat
    public Cat(String sound, String breed) {
        // Call the constructor of the parent class using "super"
        super(sound);
        this.breed = breed;
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        // Use "super" to invoke the makeSound method from the parent class
        super.makeSound();
        System.out.println("Cat's special sound: Meow!");
    }

    // Method to display cat details
    public void displayDetails() {
        System.out.println("Breed: " + breed);
    }
}

public class ExampleWithThisAndSuper {
    public static void main(String[] args) {
        // Create an instance of the Cat class
        Cat myCat = new Cat("Purr", "Siamese");

        // Call methods on the Cat object
        myCat.displayDetails();
        myCat.makeSound();
    }
}
