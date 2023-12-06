# In Java, a **wrapper class** is a class that encapsulates, or wraps, a primitive data type and provides methods to manipulate the data. The purpose of wrapper classes is to provide a way to treat primitive data types as objects

Here are the eight primitive data types in Java, each with its corresponding wrapper class:

1. `byte` - `Byte`
2. `short` - `Short`
3. `int` - `Integer`
4. `long` - `Long`
5. `float` - `Float`
6. `double` - `Double`
7. `char` - `Character`
8. `boolean` - `Boolean`

## Usage of Wrapper Classes

1. **Object-oriented Features:**
   - Wrapper classes allow primitive data types to be used in situations that require objects. For example, when working with collections or generics, only objects can be used, so wrapper classes provide a way to use primitive types in these contexts.

2. **Null Values:**
   - Wrapper classes can represent `null` values, unlike primitive types. This is useful when dealing with situations where the absence of a value needs to be represented.

3. **Utility Methods:**
   - Wrapper classes provide various utility methods for converting between primitive types and strings, parsing strings, and performing other operations.

## Example

Here's an example demonstrating the use of wrapper classes:

```java
public class WrapperClassExample {
    public static void main(String[] args) {
        // Using primitive data types
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        char primitiveChar = 'A';

        // Using wrapper classes
        Integer wrapperInteger = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        Character wrapperChar = Character.valueOf(primitiveChar);

        // Auto-boxing (implicit conversion)
        Boolean wrapperBoolean = true;

        // Auto-unboxing (implicit conversion)
        int unboxedInt = wrapperInteger;

        // Printing values
        System.out.println("Wrapper Integer: " + wrapperInteger);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Wrapper Character: " + wrapperChar);
        System.out.println("Wrapper Boolean: " + wrapperBoolean);
        System.out.println("Unboxed Integer: " + unboxedInt);
    }
}
```

In this example, primitive data types are wrapped using their corresponding wrapper classes. The process of converting a primitive type to its wrapper class is called **boxing**, and the process of converting a wrapper class to its primitive type is called **unboxing**. Auto-boxing and auto-unboxing are features introduced in Java that allow implicit conversion between primitive types and their wrapper classes.
