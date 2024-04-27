public class Binary_Search {
    public static void main(String args[]) {
        int[] arr = { 23, 45, 67, 73, 89, 101, 345 };
        int target = 101;
        Binary_Search bs = new Binary_Search();
        int ans = bs.search(arr, target);
        System.out.println(ans);
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int middle = start + (end - start) / 2; // Recalculate middle inside the loop
            if (nums[middle] == target) {
                return middle;
            }
            if (target < nums[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
