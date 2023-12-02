public class SwitchExpressionsExample {
  public static void main(String[] args) {
        int dayOfWeek = 3;

        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println("The day type is: " + dayType);

        // Using switch expression with yield (Java 16 and later)
        String dayTypeWithYield = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> {
                yield "Weekday";
            }
            case 6, 7 -> {
                yield "Weekend";
            }
            default -> {
                yield "Invalid day";
            }
        };

        System.out.println("The day type with yield is: " + dayTypeWithYield);
    }
}
