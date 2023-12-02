public class ThisKeywordExample {

    public static class Person {
        private String name;
        private int age;

        // Constructor with parameters
        public Person(String name, int age) {
            // Use "this" to refer to instance variables and distinguish them from
            // parameters
            this.name = name;
            this.age = age;
        }

        // Method to set name and age
        public void setDetails(String name, int age) {
            // Use "this" to refer to instance variables and distinguish them from
            // parameters
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
        // Create an instance of the Person class
        Person person1 = new Person("John", 25);

        // Display details using the displayDetails method
        person1.displayDetails();

        // Update details using the setDetails method
        person1.setDetails("Jane", 30);

        // Display updated details
        person1.displayDetails();
    }
}
