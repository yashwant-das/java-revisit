Certainly! Here's an example of a `for` loop in Java:

```java
public class ForLoopExample {
    public static void main(String[] args) {
        // For loop to iterate from 1 to 5
        for (int count = 1; count <= 5; count++) {
            // Code to be executed inside the loop
            System.out.println("Count: " + count);
        }

        // The loop will exit when the condition becomes false
        System.out.println("Loop complete!");
    }
}
```

In this example, the `for` loop is used to iterate from 1 to 5. The loop has three parts:

1. Initialization (`int count = 1;`): It initializes the loop variable (`count` in this case) before the loop starts.

2. Condition (`count <= 5;`): It specifies the condition for the loop to continue. The loop will continue as long as the condition is true.

3. Update (`count++`): It updates the loop variable after each iteration.

The block of code inside the loop (enclosed in curly braces `{}`) will be executed for each iteration. The program will print "Count: 1" to "Count: 5" and then "Loop complete!" after the loop execution.