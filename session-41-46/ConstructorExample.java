public class ConstructorExample {

    public static class Person {
        // Instance variables
        private String name;
        private int age;

        // Parameterized constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display person details
        public void displayDetails() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Person class using the constructor
        Person person1 = new Person("John Doe", 25);

        // Display details using the displayDetails method
        System.out.println("Details of person1:");
        person1.displayDetails();

        // Create another instance with a different set of values
        Person person2 = new Person("Jane Smith", 30);

        // Display details of the second person
        System.out.println("\nDetails of person2:");
        person2.displayDetails();
    }
}
