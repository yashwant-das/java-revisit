public class Switch {

  public static void main(String[] args) {
    String day = "Monday";
    String result = "";
    // switch 1
    // switch (day) {
    //     case "Sunday", "Saturday":
    //         System.out.println("Weeknends");
    //         break;
    //     case "Monday":
    //         System.out.println("Weekdays");
    //         break;
    //     default:
    //         System.out.println("Not sure");
    //         break;
    // }

    // switch 2
    result =
      switch (day) {
        case "Monday" -> "8am";
        case "Saturday" -> "6am";
        default -> "7am";
      };
    System.out.println(result);
  }
}
