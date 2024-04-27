public class Minimum_Number {
    public static void main(String args[]) {
        int[] arr = { 34, 56, 12, 89, 4, 2 };
        int ans1 = min1(arr);
        System.out.println("Minimum Number in the Array: " + ans1);
        // Another Method
        int ans2 = min2(arr);
        System.out.println("Minimum Number in the Array in Method one: " + ans2);
        // To Find the Maximum
        int max = max(arr);
        System.out.println("Maximum Number in the Array in Method two: " + max);

    }

    // Find the Minimum Number by using Temp
    public static int min1(int[] arr) {
        int min1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] < arr[i]) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }
        return arr[0];
    }

    // Another Logic to found a Minimum number in the array
    public static int min2(int[] arr) {
        int min2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return min2;
    }

    // To Find the Maximum
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }
        return arr[0];
    }
}
