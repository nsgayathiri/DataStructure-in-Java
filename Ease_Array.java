public class Ease_Array {
    public static void main(String args[]) {
        int arr[] = {2, 2, 0, 4, 0, 8};
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = 2 * arr[i];
                arr[i + 1] = 0;
            }
        }

        int index = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < len) {
            arr[index++] = 0;
        }

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if(arr[i] != 0 && arr[j] != 0)
            {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
