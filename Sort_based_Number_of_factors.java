import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sort_based_Number_of_factors {
    public static int[] Solution(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Calculate number of factors for each element and store in map
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            map.put(i, count);
        }

        // Create a list of indices and sort based on number of factors
        List<Integer> indicesList = new ArrayList<>(map.keySet());
        for (int num_1 = 0; num_1 < indicesList.size(); num_1++) {
            for (int num_2 = num_1 + 1; num_2 < indicesList.size(); num_2++) {
                if (map.get(indicesList.get(num_1)) < map.get(indicesList.get(num_2))) {
                    int temp = indicesList.get(num_2);
                    indicesList.set(num_2, indicesList.get(num_1));
                    indicesList.set(num_1, temp);
                }
            }
        }

        // Create a sorted array based on sorted indices
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < indicesList.size(); i++) {
            sortedArr[i] = arr[indicesList.get(i)];
        }

        return sortedArr;
    }

    public static void main(String args[]) {
        int[] arr = { 5, 11, 10, 20, 9, 16, 23 };
        int[] res_arr = Solution(arr);
        for (int num : res_arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
