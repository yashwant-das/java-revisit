public class WrapperClassExample {
    public static void main(String[] args) {
        // Using primitive data types
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        char primitiveChar = 'A';

        // Using wrapper classes
        Integer wrapperInteger = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        Character wrapperChar = Character.valueOf(primitiveChar);

        // Auto-boxing (implicit conversion)
        Boolean wrapperBoolean = true;

        // Auto-unboxing (implicit conversion)
        int unboxedInt = wrapperInteger;

        // Printing values
        System.out.println("Wrapper Integer: " + wrapperInteger);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Wrapper Character: " + wrapperChar);
        System.out.println("Wrapper Boolean: " + wrapperBoolean);
        System.out.println("Unboxed Integer: " + unboxedInt);
    }
}
