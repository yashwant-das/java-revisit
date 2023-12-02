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
