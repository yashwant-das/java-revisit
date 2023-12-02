public class ThreeDArrayExample {

    public static void main(String[] args) {
        // Declare and initialize a 3D array
        int[][][] threeDArray = {
                { { 1, 2 }, { 3, 4 } },
                { { 5, 6, 7 }, { 8, 9, 10 } },
                { { 11, 12, 13 }, { 14, 15 } }
        };

        // Access and print values from the 3D array
        System.out.println("Element at [0][1][1]: " + threeDArray[0][1][1]);
        System.out.println("Element at [2][0][2]: " + threeDArray[2][0][2]);

        // Iterate through the 3D array and print its elements
        System.out.println("Printing the entire 3D array:");
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println(); // Move to the next line for the next row in the 2D array
            }
            System.out.println(); // Add an extra line between 2D arrays
        }
    }
}
