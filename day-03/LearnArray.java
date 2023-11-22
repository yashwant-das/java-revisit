public class LearnArray {
    public static void main(String[] args) {

        // array 1
        // int arr[] = { 1, 2, 3, 4 };
        // arr[0] = 6;
        // System.out.println(arr[0]);

        // array 2
        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for (int i = 0; i < 4; i++) {
        // System.out.println(nums[i]);
        // }

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

        // Enhansed for loop
        for (int n[] : num) {
            for (int m : n) {
                System.out.println(m + " ");
            }
            System.out.println();
        }
        LearnArray student = new LearnArray();
    }
}
