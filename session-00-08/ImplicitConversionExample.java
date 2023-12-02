public class ImplicitConversionExample {
    public static void main(String[] args) {
        int intValue = 42;
        long longValue = intValue; // Implicit conversion from int to long

        float floatValue = 3.14f;
        double doubleValue = floatValue; // Implicit conversion from float to double

        System.out.println("Long Value: " + longValue);
        System.out.println("Double Value: " + doubleValue);
    }
}
