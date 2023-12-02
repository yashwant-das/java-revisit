Certainly! Here's an example of a `do-while` loop in Java:

```java
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
```

In a `do-while` loop, the block of code is executed at least once, and then the condition is checked. If the condition is true, the block of code will continue to execute. In this example, the loop will continue as long as the `count` variable is less than or equal to 5. The program will print "Count: 1" to "Count: 5" and then "Loop complete!" after the loop execution.