Certainly! Here's a simple example of a while loop in Java:

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        // Initialize a counter
        int count = 1;

        // Define the condition for the while loop
        while (count <= 5) {
            // Code to be executed inside the loop
            System.out.println("Count: " + count);

            // Increment the counter
            count++;
        }

        // The loop will exit when the condition becomes false
        System.out.println("Loop complete!");
    }
}
```

In this example, the while loop will continue executing as long as the `count` variable is less than or equal to 5. Inside the loop, the current value of `count` is printed, and the counter is incremented. The loop will exit when the condition becomes false, and the program will print "Loop complete!" after the loop execution.