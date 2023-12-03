# In Java, `this` and `super` are special keywords that are used to refer to the current object and the immediate parent class respectively. Let's delve into each one

## `this` Keyword

The `this` keyword is a reference to the current object. It is primarily used to differentiate instance variables from local variables when they share the same name, or to call other constructors from within a constructor.

**Example: Using `this` to differentiate variables:**

```java
public class MyClass {
    private int x;

    public void setX(int x) {
        // Use "this" to refer to the instance variable
        this.x = x;
    }
}
```

**Example: Using `this` to call another constructor:**

```java
public class MyClass {
    private int x;

    // Parameterized constructor
    public MyClass(int x) {
        this.x = x;
    }

    // Default constructor calling the parameterized constructor using "this"
    public MyClass() {
        this(0); // Calls the parameterized constructor with 0 as the argument
    }
}
```

## `super` Keyword

The `super` keyword is used to refer to the immediate parent class object. It is often used to call methods, access fields, or invoke the constructor of the superclass.

**Example: Using `super` to call a method from the parent class:**

```java
public class ParentClass {
    public void display() {
        System.out.println("This is the parent class");
    }
}

public class ChildClass extends ParentClass {
    public void displayFromChild() {
        // Use "super" to call the display method from the parent class
        super.display();
    }
}
```

**Example: Using `super` to call the constructor of the parent class:**

```java
public class ParentClass {
    private int x;

    // Parameterized constructor
    public ParentClass(int x) {
        this.x = x;
    }
}

public class ChildClass extends ParentClass {
    public ChildClass(int x, int y) {
        // Call the parameterized constructor of the parent class using "super"
        super(x);
        // Additional initialization for the child class
    }
}
```

In summary:

- `this` is used to refer to the current object and is commonly used for disambiguating variable names and calling other constructors.
- `super` is used to refer to the immediate parent class and is often used for invoking methods or constructors in the superclass.

Feel free to ask if you have specific questions or if there's a particular aspect you'd like to explore further!
