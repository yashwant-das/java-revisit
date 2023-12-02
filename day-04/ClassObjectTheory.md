# Here's an overview of the theory related to classes and objects in Java

## Class and Object Theory in Java

### 1. **Class:**

- **Definition:** A class is a blueprint or a template for creating objects.
- **Purpose:** It defines the structure and behavior that the objects of the class will have.
- **Example:**

     ```java
     public class Car {
         // Class members (fields, methods, etc.) go here
     }
     ```

### 2. **Object:**

- **Definition:** An object is an instance of a class, created from the class blueprint.
- **Purpose:** It represents a real-world entity and encapsulates data and methods that operate on the data.
- **Example:**

     ```java
     Car myCar = new Car();
     ```

### 3. **Attributes (Fields):**

- **Definition:** Attributes represent the properties or characteristics of an object.
- **Example:**

     ```java
     public class Car {
         String brand;
         int year;
     }
     ```

### 4. **Methods:**

- **Definition:** Methods define the behavior or actions that objects of the class can perform.
- **Example:**

     ```java
     public class Car {
         void startEngine() {
             // Code to start the car's engine
         }
     }
     ```

### 5. **Constructor:**

- **Definition:** A special method used for initializing objects. It has the same name as the class.
- **Example:**

     ```java
     public class Car {
         // Constructor
         public Car(String brand, int year) {
             this.brand = brand;
             this.year = year;
         }
     }
     ```

### 6. **Encapsulation:**

- **Definition:** Encapsulation is the bundling of data (fields) and methods that operate on the data within a class.
- **Purpose:** It restricts access to some of the object's components and protects the integrity of the data.

### 7. **Inheritance:**

- **Definition:** Inheritance is a mechanism where a new class inherits properties and behaviors from an existing class.
- **Purpose:** It promotes code reusability and establishes a relationship between classes.

### 8. **Polymorphism:**

- **Definition:** Polymorphism allows objects of different types to be treated as objects of a common type.
- **Purpose:** It enables flexibility in code design and supports method overriding and method overloading.

### 9. **Object Instantiation:**

- **Definition:** The process of creating an instance (object) of a class.
- **Example:**

     ```java
     Car myCar = new Car();
     ```

Understanding these concepts is fundamental to Java programming, as they form the basis of creating well-organized and reusable code.
