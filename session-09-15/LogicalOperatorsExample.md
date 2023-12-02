Logical operators in Java are used to perform logical operations on boolean values. They are often used in conditional statements and loops to make decisions based on multiple conditions. Here are the common logical operators in Java:

### AND (`&&`):

```java
boolean condition1 = true;
boolean condition2 = false;

boolean result = condition1 && condition2;  // AND operation
System.out.println("Result of AND operation: " + result);  // Outputs: false
```

### OR (`||`):

```java
boolean condition3 = true;
boolean condition4 = false;

boolean result2 = condition3 || condition4;  // OR operation
System.out.println("Result of OR operation: " + result2);  // Outputs: true
```

### NOT (`!`):

```java
boolean condition5 = true;

boolean result3 = !condition5;  // NOT operation
System.out.println("Result of NOT operation: " + result3);  // Outputs: false
```

These logical operators allow you to combine boolean values and make more complex decisions in your Java programs. They are often used in `if` statements, `while` loops, and other control flow structures.

### Example combining logical operators:

```java
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = false;

        // Combining AND and OR
        boolean goToBeach = isSunny && isWarm || !isSunny;
        System.out.println("Should I go to the beach? " + goToBeach);  // Outputs: true
    }
}
```

In this example, the logical operators `&&` and `||` are combined to decide whether to go to the beach based on the conditions of being sunny and warm.