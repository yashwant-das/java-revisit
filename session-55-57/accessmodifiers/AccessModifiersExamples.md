# Let's create a simple example to illustrate the use of access modifiers in Java. In this example, we'll have multiple classes to demonstrate how access modifiers work in different scenarios

```java
// File: ExampleClass.java (Default access)
class ExampleClass {
    int defaultField; // Package-private field

    void defaultMethod() {
        System.out.println("Default method in ExampleClass");
    }
}

// File: PublicClass.java (Public access)
public class PublicClass {
    public int publicField;
    
    public void publicMethod() {
        System.out.println("Public method in PublicClass");
    }
}

// File: PrivateExample.java (Private access)
class PrivateExample {
    private int privateField;

    private void privateMethod() {
        System.out.println("Private method in PrivateExample");
    }

    // This method can access the private members of the class
    void accessPrivateMembers() {
        privateField = 10;
        privateMethod();
    }
}

// File: SubclassExample.java (Protected access)
class SubclassExample extends ExampleClass {
    void accessProtectedMembers() {
        protectedField = 20; // Accessing protected field from the superclass
        protectedMethod();   // Accessing protected method from the superclass
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // ExampleClass (default access)
        ExampleClass example = new ExampleClass();
        example.defaultField = 5;
        example.defaultMethod();

        // PublicClass (public access)
        PublicClass publicExample = new PublicClass();
        publicExample.publicField = 15;
        publicExample.publicMethod();

        // PrivateExample (private access)
        PrivateExample privateExample = new PrivateExample();
        privateExample.accessPrivateMembers();

        // SubclassExample (protected access)
        SubclassExample subclassExample = new SubclassExample();
        subclassExample.accessProtectedMembers();
    }
}
```

In this example:

- `ExampleClass` has default (package-private) access members.
- `PublicClass` has public access members.
- `PrivateExample` has private access members and a method to demonstrate access within the same class.
- `SubclassExample` is a subclass of `ExampleClass` and demonstrates the use of protected access.

In the `Main` class, we create instances of each class and demonstrate how to access their members based on the access modifiers.
