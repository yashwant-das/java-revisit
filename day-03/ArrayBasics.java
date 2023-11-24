
public class ArrayBasics {
    public static void main(String[] args) {

        // array 1
        int arr[] = { 1, 2, 3, 4 };
        arr[0] = 6;
        System.out.println(arr[0]);

        // array 3
        int num[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        // Enhansed for loop 1
        for (int n[] : num) {
            for (int m : n) {
                System.out.println(m + " ");
            }
            System.out.println();
        }

        // array 2
        int numbers[] = new int[4];
        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 3;
        numbers[3] = 9;

        // basic loop to get the data
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhansed for loop to get the data from array 2
        System.out.println("Enhansed for loop to get the data from array 2");
        for (int number : numbers) {

            System.err.println(number);
        }

    }
}
