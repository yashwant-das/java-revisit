# In Java, the `final` keyword is a modifier that can be applied to various entities, such as classes, methods, and variables. Its usage indicates that the entity is not meant to be changed or overridden

Here's a brief overview of how `final` is used in different contexts:

1. **Final Variable:**
   - When applied to a variable, it means that the variable cannot be reassigned once it has been initialized. It becomes a constant.
   - Example:

     ```java
     final int MAX_VALUE = 100;
     ```

2. **Final Method:**
   - When applied to a method, it means that the method cannot be overridden by subclasses.
   - Example:

     ```java
     class BaseClass {
         final void myMethod() {
             // Method implementation
         }
     }

     class Subclass extends BaseClass {
         // This will result in a compilation error
         // because myMethod in the superclass is marked as final.
         void myMethod() {
             // Method implementation in the subclass
         }
     }
     ```

3. **Final Class:**
   - When applied to a class, it means that the class cannot be subclassed. It prevents the creation of subclasses.
   - Example:

     ```java
     final class FinalClass {
         // Class implementation
     }

     // This will result in a compilation error
     // because FinalClass is marked as final.
     class Subclass extends FinalClass {
         // Subclass implementation
     }
     ```

4. **Final Parameter:**
   - When applied to a method parameter, it means that the value of the parameter cannot be changed within the method.
   - Example:

     ```java
     void myMethod(final int value) {
         // This will result in a compilation error
         // because you cannot reassign a value to a final parameter.
         // value = 10;
     }
     ```

5. **Finalize Method:**
   - The `finalize` method is a method of the `Object` class that can be overridden by a class. It is called by the garbage collector before an object is reclaimed.
   - Example:

     ```java
     class MyClass {
         // The finalize method
         protected void finalize() {
             // Cleanup code
         }
     }
     ```

The use of the `final` keyword helps in making the code more robust, secure, and maintainable by indicating the intention that certain entities should not be modified or extended.
