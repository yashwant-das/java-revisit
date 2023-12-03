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
