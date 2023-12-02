# In Java, a method is a block of code that performs a specific task and can be executed by calling its name. Methods are used to break down a program into smaller, more manageable pieces. Here's a simple example:

```java
public class Example {

    // This is a simple method that prints a message
    static void printMessage() {
        System.out.println("Hello, I am a method!");
    }

    // This method takes two parameters and returns their sum
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the printMessage method
        printMessage();

        // Calling the add method and storing the result in a variable
        int result = add(5, 3);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
```

In this example:

- `printMessage` is a method that doesn't take any parameters and doesn't return anything. It simply prints a message.

- `add` is a method that takes two parameters (`a` and `b`), adds them together, and returns the result as an integer.

- The `main` method is the entry point of the program. It calls the `printMessage` method and the `add` method, demonstrating how to use methods in Java.

Feel free to ask more questions or seek clarification on any part of the example!
