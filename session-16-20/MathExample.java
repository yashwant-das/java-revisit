public class MathExample {
    public static void main(String[] args) {
        // Basic Arithmetic Operations
        int sum = Math.addExact(5, 3);
        int difference = Math.subtractExact(8, 3);
        int product = Math.multiplyExact(4, 5);
        double quotient = Math.floorDiv(10, 3);

        // Exponential and Logarithmic Functions
        double powerResult = Math.pow(2, 3);
        double sqrtResult = Math.sqrt(25);
        double logValue = Math.log(10);

        // Trigonometric Functions
        double sineValue = Math.sin(Math.toRadians(30));
        double cosineValue = Math.cos(Math.toRadians(45));
        double tangentValue = Math.tan(Math.toRadians(60));

        // Rounding and Absolute Value
        long roundedValue = Math.round(3.7);
        double ceilValue = Math.ceil(4.2);
        double floorValue = Math.floor(4.9);
        int absoluteValue = Math.abs(-10);

        // Random Number Generation
        double randomDouble = Math.random();
        int randomIntInRange = (int) (Math.random() * (10 - 5 + 1) + 5);

        // Displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        System.out.println("Power Result: " + powerResult);
        System.out.println("Square Root Result: " + sqrtResult);
        System.out.println("Logarithm Value: " + logValue);

        System.out.println("Sine Value: " + sineValue);
        System.out.println("Cosine Value: " + cosineValue);
        System.out.println("Tangent Value: " + tangentValue);

        System.out.println("Rounded Value: " + roundedValue);
        System.out.println("Ceil Value: " + ceilValue);
        System.out.println("Floor Value: " + floorValue);
        System.out.println("Absolute Value: " + absoluteValue);

        System.out.println("Random Double: " + randomDouble);
        System.out.println("Random Integer in Range (5-10): " + randomIntInRange);
    }
}
