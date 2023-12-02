public class GettersAndSettersExample {

    public static class Person {
        // Private attributes
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Setter methods
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            // Validation can be added here if needed
            this.age = age;
        }

        // Additional method
        public void displayPersonInfo() {
            System.out.println("Person: " + name + " (" + age + " years old)");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("John", 30);

        // Use getter methods to access attributes
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Use setter methods to modify attributes
        person.setName("Jane");
        person.setAge(25);

        // Display updated person information
        person.displayPersonInfo();
    }
}
