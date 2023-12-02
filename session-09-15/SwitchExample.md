The `switch` statement in Java provides a way to make decisions based on the value of an expression. It is a convenient alternative to a series of `if-else` statements when you need to compare a single variable against multiple possible values. Here's a basic example:

```java
public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

In this example:

- The `switch` statement is used to check the value of the `dayOfWeek` variable.
- Each `case` represents a possible value of `dayOfWeek`.
- The `break` statement is used to exit the `switch` block after a match is found.

You can also use the `default` case to handle situations where none of the specified cases match the value of the expression.

Here's a more complex example using `switch` with strings (available from Java 7 onward):

```java
public class StringSwitchExample {
    public static void main(String[] args) {
        String dayOfWeek = "Wednesday";

        switch (dayOfWeek) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Wednesday":
                System.out.println("Midweek");
                break;
            case "Friday":
                System.out.println("End of the week");
                break;
            default:
                System.out.println("Not a special day");
        }
    }
}
```

In this example, the `switch` statement is used with a `String` expression, allowing you to compare strings directly.

Feel free to run these examples and experiment with different values for `dayOfWeek` to see how the `switch` statement works. If you have any questions or need further clarification, feel free to ask!