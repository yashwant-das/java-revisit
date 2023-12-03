# Here's an example where the class name is "AnonymousObjectsExample," and it demonstrates the use of anonymous objects

```java
public class AnonymousObjectsExample {

    // Book class
    static class Book {
        private String title;
        private double price;

        // Parameterized constructor
        public Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        // Method to calculate and display discounted price
        public void displayDiscountedPrice(double discountPercentage) {
            double discountedPrice = price - (price * discountPercentage / 100);
            System.out.println("Title: " + title);
            System.out.println("Original Price: $" + price);
            System.out.println("Discounted Price: $" + discountedPrice);
            System.out.println(); // Adding a newline for better readability
        }
    }

    public static void main(String[] args) {
        // Using anonymous objects to calculate and display discounted prices
        new Book("Java Programming", 45.99).displayDiscountedPrice(10);
        new Book("Data Structures in Python", 39.99).displayDiscountedPrice(15);
    }
}
```

In this example:

- The main class is named `AnonymousObjectsExample`.
- Inside this class, there is a nested `Book` class, which represents the book entity.
- The `main` method creates two anonymous objects of the `Book` class, each with a different book title and price, and calls the `displayDiscountedPrice` method on each object.

Feel free to use this structure as a template for your own classes, adjusting the names and structure as needed for your specific use case.
