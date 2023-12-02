public class SwitchExample {

}

class CombinedSwitchExample {
    public static void main(String[] args) {
        // Numeric switch example
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // String switch example (Java 7 and later)
        String dayOfWeekString = "Wednesday";

        switch (dayOfWeekString) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Wednesday":
                System.out.println("Midweek");
                break;
            case "Friday":
                System.out.println("End of the week");
                break;
            default:
                System.out.println("Not a special day");
        }
    }
}
