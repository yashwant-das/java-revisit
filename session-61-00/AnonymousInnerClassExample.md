# An **anonymous inner class** in Java is a class without a name that is defined and instantiated at the same time. It is often used for one-time use, typically when you need to override methods of a class or implement an interface in a concise manner

Here's a basic syntax for creating an anonymous inner class:

```java
interface Greet {
    void sayHello();
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        // Creating an anonymous inner class implementing the Greet interface
        Greet greet = new Greet() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous inner class");
            }
        };

        // Calling the method defined in the interface
        greet.sayHello();
    }
}
```

In this example:

- We have an interface `Greet` with a single method `sayHello`.
- Instead of creating a separate class to implement the interface, we use an anonymous inner class to provide the implementation on the fly.
- The anonymous inner class is created using the `new Greet() {...}` syntax, and the `sayHello` method is overridden within the anonymous class.

Anonymous inner classes are commonly used in scenarios such as:

1. **Event Handling:**

   ```java
   button.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           System.out.println("Button clicked!");
       }
   });
   ```

2. **Thread Creation:**

   ```java
   Thread thread = new Thread(new Runnable() {
       public void run() {
           System.out.println("Thread is running");
       }
   });
   ```

3. **Interface Implementation:**

   ```java
   List<String> myList = new ArrayList<String>() {
       public boolean add(String element) {
           // Custom implementation
           return super.add(element);
       }
   };
   ```

Keep in mind that with the introduction of Java 8 and lambda expressions, anonymous inner classes are less commonly used for simple interface implementations. Lambdas provide a more concise syntax for achieving the same result.
