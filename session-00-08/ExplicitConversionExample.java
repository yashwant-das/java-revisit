public class ExplicitConversionExample {
    public static void main(String[] args) {
        double doubleValue = 3.14;
        int intValue = (int) doubleValue; // Explicit conversion from double to int (possible data loss)

        System.out.println("Int Value: " + intValue);
    }
}
