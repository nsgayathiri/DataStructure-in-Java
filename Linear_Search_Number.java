public class Linear_Search_Number {
    public static void main(String args[]) {
        int[] arr = { 23, 4, 89, 45, 79 };
        int target = 89;
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    } 
}