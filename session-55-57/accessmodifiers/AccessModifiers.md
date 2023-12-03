# In Java, access modifiers are keywords that determine the visibility or accessibility of classes, methods, and fields in a program. They control which parts of a program can access a particular class, method, or field. Java provides four types of access modifiers

Here's a table summarizing the access modifiers in Java:

| Access Modifier | Visibility | Within Class | Within Package | Outside Package (Subclass) | Outside Package (Non-subclass) |
| --------------- | ---------- | ------------ | --------------- | ------------------------- | ------------------------------- |
| **Default (Package-Private)** | Package-private | Yes | Yes | No | No |
| **Public** | Public | Yes | Yes | Yes | Yes |
| **Private** | Private | Yes | No | No | No |
| **Protected** | Protected | Yes | Yes | Yes | No |

- **Default (Package-Private):**
  - No modifier is used. Access is limited to classes within the same package.
  - Examples:

    ```java
    class ExampleClass {
        int defaultField; // Package-private field
    }
    ```

- **Public:**
  - The most permissive modifier. Access is allowed from any other class.
  - Examples:

    ```java
    public class PublicClass {
        public int publicField;
        public void publicMethod() {
            // Code here
        }
    }
    ```

- **Private:**
  - Access is restricted to within the same class.
  - Examples:

    ```java
    public class ExampleClass {
        private int privateField;
        private void privateMethod() {
            // Code here
        }
    }
    ```

- **Protected:**
  - Access is allowed within the same package and by subclasses (even if they are in different packages).
  - Examples:

    ```java
    public class ExampleClass {
        protected int protectedField;
        protected void protectedMethod() {
            // Code here
        }
    }
    ```

Choose the appropriate access modifier based on the level of visibility and encapsulation required for your classes, methods, and fields.
