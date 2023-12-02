In Java, the `if-else` statement is used for decision-making. It allows your program to execute different code blocks based on whether a given condition is true or false. Here's a basic example:

```java
public class IfElseExample {
    public static void main(String[] args) {
        int number = 10;

        // If-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
```

In this example:

- The condition `number > 0` is checked.
- If the condition is true, the code block inside the first set of curly braces `{}` is executed.
- If the condition is false, the code block inside the second set of curly braces `{}` (the `else` block) is executed.

You can also have multiple conditions using `else if`. Here's an extended example:

```java
public class IfElseIfExample {
    public static void main(String[] args) {
        int score = 75;

        // If-else if-else statement
        if (score >= 90) {
            System.out.println("Excellent! You got an A.");
        } else if (score >= 80) {
            System.out.println("Good job! You got a B.");
        } else if (score >= 70) {
            System.out.println("Well done! You got a C.");
        } else {
            System.out.println("Sorry, you need to improve. You got a grade below C.");
        }
    }
}
```

In this example, the program checks the value of the `score` variable and prints a corresponding message based on the score range.

Remember:
- Conditions in `if` statements are evaluated from top to bottom, and only the code block of the first true condition (or the `else` block) is executed.
- `else` is optional, and you can have multiple `else if` blocks based on your needs.
- You can nest `if-else` statements to create more complex decision-making structures.