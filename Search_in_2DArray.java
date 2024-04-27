import java.util.Arrays;

public class Search_in_2DArray {
    public static void main(String args[]) {
        int[][] arr = {
                { 34, 25, 78, 7 },
                { 45, 76, 81, 70, 1 },
                { 12, 38, 34, 99, 4, 76, 23 }
        };
        int target = 76;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans)); // Print the contents of ans array
    }

    public static int[] Search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
 