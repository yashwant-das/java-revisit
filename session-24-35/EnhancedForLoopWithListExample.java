import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoopWithListExample {

    public static void main(String[] args) {
        // Declare and initialize a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Using enhanced for loop to iterate over the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
