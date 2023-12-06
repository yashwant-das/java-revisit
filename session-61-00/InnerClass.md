# In Java, an **inner class** is a class defined within another class. Inner classes have several advantages, including encapsulation, better organization of code, and access to the members of the outer class. There are four types of inner classes in Java

1. **Member Inner Class:**
   - A **member inner class** is defined at the member level of a class, and it can be accessed like any other member of the class.

   ```java
   class Outer {
       // Member variable
       private int outerVar = 10;

       // Member inner class
       class Inner {
           void display() {
               System.out.println("Outer variable: " + outerVar);
           }
       }
   }
   ```

   - To instantiate and use the member inner class:

   ```java
   Outer outer = new Outer();
   Outer.Inner inner = outer.new Inner();
   inner.display();
   ```

2. **Static Nested Class:**
   - A **static nested class** is a static class defined at the member level of a class. It does not have access to the instance variables and methods of the outer class.

   ```java
   class Outer {
       // Static nested class
       static class Nested {
           void display() {
               System.out.println("Static nested class");
           }
       }
   }
   ```

   - To instantiate and use the static nested class:

   ```java
   Outer.Nested nested = new Outer.Nested();
   nested.display();
   ```

3. **Local Inner Class:**
   - A **local inner class** is defined within a block of code, typically within a method. It has access to the final or effectively final local variables of the enclosing method.

   ```java
   class Outer {
       void outerMethod() {
           final int localVar = 20;

           // Local inner class
           class LocalInner {
               void display() {
                   System.out.println("Local variable: " + localVar);
               }
           }

           LocalInner localInner = new LocalInner();
           localInner.display();
       }
   }
   ```

   - To instantiate and use the local inner class:

   ```java
   Outer outer = new Outer();
   outer.outerMethod();
   ```

4. **Anonymous Inner Class:**
   - An **anonymous inner class** is a class without a name that is defined and instantiated at the same time. It is often used for one-time use.

   ```java
   interface Greet {
       void sayHello();
   }

   public class AnonymousInnerClass {
       public static void main(String[] args) {
           // Anonymous inner class implementing the Greet interface
           Greet greet = new Greet() {
               @Override
               public void sayHello() {
                   System.out.println("Hello from anonymous inner class");
               }
           };

           greet.sayHello();
       }
   }
   ```

   - Anonymous inner classes are commonly used in event handling and implementation of interfaces.

Inner classes provide a way to logically group classes and interfaces in Java, enhancing code modularity and encapsulation. The choice of the type of inner class depends on the specific requirements of the program.
