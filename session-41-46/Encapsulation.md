# Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) principles, along with inheritance, polymorphism, and abstraction. It is a concept that involves bundling the data (attributes) and the methods (functions) that operate on the data into a single unit known as a class. Encapsulation helps in hiding the internal implementation details of a class and exposing only what is necessary

Here are key aspects of encapsulation in Java:

1. **Private Access Modifier:**
   - Attributes of a class are often marked as `private`, meaning they can only be accessed within the class. This restricts direct access from outside the class.

   ```java
   public class Example {
       private int age;  // private attribute
   }
   ```

2. **Public Methods:**
   - Access to the private attributes is provided through public methods (getters and setters). This ensures controlled and validated access to the data.

   ```java
   public class Example {
       private int age;  // private attribute

       // Getter method
       public int getAge() {
           return age;
       }

       // Setter method
       public void setAge(int newAge) {
           if (newAge > 0) {
               age = newAge;
           }
       }
   }
   ```

3. **Information Hiding:**
   - Encapsulation helps in hiding the internal details of the class, allowing changes to the internal implementation without affecting the external code that uses the class.

4. **Maintainability:**
   - Encapsulation makes code more maintainable by encapsulating the implementation details. If changes are needed, they can be made within the class without affecting the rest of the program.

Here's a simple example illustrating encapsulation:

```java
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
```

In this example, the attributes `name` and `age` are private, and access to them is provided through public getter and setter methods. This way, the internal state of the `Person` class is encapsulated.

Encapsulation promotes the principle of "information hiding," which is crucial for building robust and maintainable software. If you have further questions or need more clarification, feel free to ask!
