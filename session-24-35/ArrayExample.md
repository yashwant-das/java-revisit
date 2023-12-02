# In Java, an array is a data structure that allows you to store multiple values of the same type under a single variable name. Each element in the array is identified by an index, and the index starts at 0

Here's a basic example demonstrating the use of arrays in Java:

```java
public class ArrayExample {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = new int[5];

        // Assign values to the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Access and print values from the array
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 4: " + numbers[4]);

        // Calculate and print the sum of all elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
```

In this example:

- An array of integers named `numbers` is declared and initialized with a size of 5 using `new int[5]`.
- Values are assigned to each element of the array using index notation.
- The values are accessed and printed using index notation.
- A `for` loop is used to calculate the sum of all elements in the array.

Key points about arrays in Java:

- The size of an array is fixed once it is declared, and you cannot change it dynamically.
- Arrays are zero-indexed, meaning the index of the first element is 0, the second element is 1, and so on.
- The length of an array can be obtained using the `length` property (`numbers.length` in the example).

Feel free to ask if you have any specific questions about arrays or if you'd like more examples!
