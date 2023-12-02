public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = false;

        // Combining AND and OR
        boolean goToBeach = isSunny && isWarm || !isSunny;
        System.out.println("Should I go to the beach? " + goToBeach); // Outputs: true
    }
}
