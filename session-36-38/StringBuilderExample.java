public class StringBuilderExample {

    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Append additional strings to the existing StringBuilder
        stringBuilder.append(" ");
        stringBuilder.append("World");

        // Insert a string at a specific position
        stringBuilder.insert(6, " Java");

        // Replace a portion of the string
        stringBuilder.replace(0, 5, "Hi");

        // Delete a portion of the string
        stringBuilder.delete(3, 6);

        // Display the final result
        System.out.println("Final Result: " + stringBuilder.toString());
    }
}
