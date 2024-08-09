import java.util.Arrays;

public class NearestSquare {

    static void squareRootAndTransform(int pos, int[] arr) {
        int diff1, diff2;
        int[] srValue = new int[11];
        for (int i = 1; i <= 10; i++) {
            srValue[i] = i * i;
        }

        int element = arr[pos - 1];  
        int nearestSq = 0;
        for (int k = 1; k < srValue.length; k++) {
            if (srValue[k] >= element) {
                diff1 = srValue[k] - element;
                diff2 = element - srValue[k - 1];
                if (diff1 < diff2) {
                    nearestSq = srValue[k];
                } else {
                    nearestSq = srValue[k - 1];
                }
                break;
            }
        }

        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != pos - 1) {
                newArr[j++] = arr[i];
            }
        }

        Arrays.sort(newArr);

      
        int[] result = new int[arr.length];
        result[0] = nearestSq;
        System.arraycopy(newArr, 0, result, 1, newArr.length);

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int pos = 2;
        int[] arr = {45, 23, 11, 57, 68, 32};
        squareRootAndTransform(pos, arr);

        int pos2 = 4;
        int[] arr2 = {45, 23, 11, 17, 68, 32};
        squareRootAndTransform(pos2, arr2);
    }
}
