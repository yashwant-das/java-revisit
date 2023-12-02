public class DefaultConstructorExample {
    private int defaultValue;

    // Default constructor is automatically provided by Java if not explicitly
    // defined
    // It initializes instance variables to their default values

    public void displayValue() {
        System.out.println("Default Value: " + defaultValue);
    }

    public static void main(String[] args) {
        DefaultConstructorExample example = new DefaultConstructorExample();
        example.displayValue();
    }
}
