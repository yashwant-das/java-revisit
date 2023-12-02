public class ParameterizedConstructorExample {
    private int customValue;

    // Parameterized constructor with one parameter
    public ParameterizedConstructorExample(int value) {
        customValue = value;
    }

    public void displayValue() {
        System.out.println("Custom Value: " + customValue);
    }

    public static void main(String[] args) {
        ParameterizedConstructorExample example = new ParameterizedConstructorExample(42);
        example.displayValue();
    }
}
