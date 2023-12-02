public class JaggedArrayExample {

    public static void main(String[] args) {
        // Declare and initialize a jagged array
        int[][] jaggedArray = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };

        // Access and print values from the jagged array
        System.out.println("Element at [0][2]: " + jaggedArray[0][2]);
        System.out.println("Element at [2][1]: " + jaggedArray[2][1]);

        // Iterate through the jagged array and print its elements
        System.out.println("Printing the entire jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
