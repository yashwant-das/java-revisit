Java 12 introduced the concept of switch expressions, which allows you to use switch as an expression instead of just a statement. This feature was enhanced further in later versions of Java (starting from Java 14) with the introduction of pattern matching. Here's an example of switch expressions in Java:

```java
public class SwitchExpressionsExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println("The day type is: " + dayType);
    }
}
```

In this example:

- The `switch` expression is used to determine the type of a day based on its numeric value.
- The `->` arrow is used to associate a value with each case.
- The `break` statement is not needed because each case returns a value directly.
- The `default` case is handled with `default ->`.

Additionally, starting from Java 16, the `switch` expression can use the `yield` statement to produce a value from a block. Here's an example:

```java
public class SwitchExpressionsWithYieldExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> {
                yield "Weekday";
            }
            case 6, 7 -> {
                yield "Weekend";
            }
            default -> {
                yield "Invalid day";
            }
        };

        System.out.println("The day type is: " + dayType);
    }
}
```

In this example, the `yield` statement is used to produce a value from each block.

These switch expressions provide a more concise and expressive way to handle multiple conditions. If you're using a Java version that supports these features (Java 12 and later), you can try them out in your code.