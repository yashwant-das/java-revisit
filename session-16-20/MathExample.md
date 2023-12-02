# In Java, the `java.lang.Math` class provides a set of methods for performing mathematical operations. Here are some commonly used methods

## 1. Basic Arithmetic Operations

- **Addition:**

  ```java
  int sum = Math.addExact(5, 3); // Result: 8
  ```

- **Subtraction:**

  ```java
  int difference = Math.subtractExact(8, 3); // Result: 5
  ```

- **Multiplication:**

  ```java
  int product = Math.multiplyExact(4, 5); // Result: 20
  ```

- **Division:**

  ```java
  double quotient = Math.floorDiv(10, 3); // Result: 3.0
  ```

### 2. Exponential and Logarithmic Functions

- **Power:**

  ```java
  double result = Math.pow(2, 3); // Result: 8.0
  ```

- **Square Root:**

  ```java
  double sqrt = Math.sqrt(25); // Result: 5.0
  ```

- **Logarithm:**

  ```java
  double logValue = Math.log(10); // Result: 2.302585092994046
  ```

### 3. Trigonometric Functions

- **Sine:**

  ```java
  double sineValue = Math.sin(Math.toRadians(30)); // Result: 0.49999999999999994
  ```

- **Cosine:**

  ```java
  double cosineValue = Math.cos(Math.toRadians(45)); // Result: 0.7071067811865475
  ```

- **Tangent:**

  ```java
  double tangentValue = Math.tan(Math.toRadians(60)); // Result: 1.7320508075688772
  ```

### 4. Rounding and Absolute Value

- **Round:**

  ```java
  long roundedValue = Math.round(3.7); // Result: 4
  ```

- **Ceil and Floor:**

  ```java
  double ceilValue = Math.ceil(4.2); // Result: 5.0
  double floorValue = Math.floor(4.9); // Result: 4.0
  ```

- **Absolute Value:**

  ```java
  int absoluteValue = Math.abs(-10); // Result: 10
  ```

### 5. Random Number Generation

- **Random Double:**

  ```java
  double randomDouble = Math.random(); // Result: a random value between 0.0 (inclusive) and 1.0 (exclusive)
  ```

- **Random Integer in a Range:**

  ```java
  int randomInt = (int) (Math.random() * (max - min + 1) + min);
  ```

These are just a few examples of the many mathematical functions available in the `Math` class. When using these functions, make sure to handle exceptions that may occur, such as `ArithmeticException` for invalid operations.
