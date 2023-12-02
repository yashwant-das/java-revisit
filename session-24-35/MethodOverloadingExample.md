# Method overloading in Java allows you to define multiple methods in the same class with the same name but different parameter lists. The compiler distinguishes between the methods based on the number or type of parameters

Here's an example demonstrating method overloading:

```java
public class MethodOverloadingExample {

    // Method with two integer parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the overloaded methods
        int result1 = add(5, 3);
        int result2 = add(2, 4, 6);
        double result3 = add(2.5, 3.5);

        // Printing the results
        System.out.println("Sum (int): " + result1);
        System.out.println("Sum (int): " + result2);
        System.out.println("Sum (double): " + result3);
    }
}
```

In this example:

- There are three `add` methods with different parameter lists (number and type of parameters).
- The first `add` method takes two integers, the second takes three integers, and the third takes two doubles.
- In the `main` method, we call each of the overloaded methods with different arguments.

Method overloading provides flexibility and makes the code more readable. It allows you to use the same method name for different behaviors based on the parameters provided. Feel free to ask if you have any questions or need further clarification!
