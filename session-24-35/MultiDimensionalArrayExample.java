public class MultiDimensionalArrayExample {

    public static void main(String[] args) {
        // Declare and initialize a 2D array (matrix)
        int[][] matrix = new int[3][4];

        // Assign values to the elements of the 2D array
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;

        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;

        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;

        // Access and print values from the 2D array
        System.out.println("Element at [0][0]: " + matrix[0][0]);
        System.out.println("Element at [1][2]: " + matrix[1][2]);
        System.out.println("Element at [2][3]: " + matrix[2][3]);

        // Iterate through the 2D array and print its elements
        System.out.println("Printing the entire 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
