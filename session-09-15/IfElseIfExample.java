public class IfElseIfExample {
    public static void main(String[] args) {
        int number = 10;

        // If-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        // If-else if-else statement
        int score = 75;

        if (score >= 90) {
            System.out.println("Excellent! You got an A.");
        } else if (score >= 80) {
            System.out.println("Good job! You got a B.");
        } else if (score >= 70) {
            System.out.println("Well done! You got a C.");
        } else {
            System.out.println("Sorry, you need to improve. You got a grade below C.");
        }
    }
}
