public class StringBufferExample {

    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Append additional strings to the existing StringBuffer
        stringBuffer.append(" ");
        stringBuffer.append("World");

        // Insert a string at a specific position
        stringBuffer.insert(6, " Java");

        // Replace a portion of the string
        stringBuffer.replace(0, 5, "Hi");

        // Delete a portion of the string
        stringBuffer.delete(3, 6);

        // Display the final result
        System.out.println("Final Result: " + stringBuffer.toString());
    }
}
