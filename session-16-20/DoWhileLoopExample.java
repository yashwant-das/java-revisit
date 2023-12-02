public class DoWhileLoopExample {
    public static void main(String[] args) {
        // Initialize a counter
        int count = 1;

        // Do-while loop
        do {
            // Code to be executed inside the loop
            System.out.println("Count: " + count);

            // Increment the counter
            count++;
        } while (count <= 5);

        // The loop will exit when the condition becomes false
        System.out.println("Loop complete!");
    }
}
