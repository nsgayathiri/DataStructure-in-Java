import java.util.Arrays;

public class Insertion_sort {
    public static void main(String args[]) {
        int[] arr = {8, 3, 1, 6,-14, 0, 4};
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}