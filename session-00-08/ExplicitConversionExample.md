### Explicit Type Conversion (Casting):

When there is a possibility of data loss, explicit type conversion is required. This is also known as casting. Here's an example:

```java
public class ExplicitConversionExample {
    public static void main(String[] args) {
        double doubleValue = 3.14;
        int intValue = (int) doubleValue; // Explicit conversion from double to int (possible data loss)

        System.out.println("Int Value: " + intValue);
    }
}
```

In this case, we use `(int)` to explicitly cast the `doubleValue` to an `int`. Be cautious with explicit conversions, as there may be a loss of precision.

### Note:

- Implicit conversions are performed automatically when there is no loss of information.
- Explicit conversions require manual intervention and may result in data loss.

Understanding when to use implicit and explicit type conversion is crucial for writing robust and error-free Java programs.
