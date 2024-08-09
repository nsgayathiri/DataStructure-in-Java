import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.fill(result, -1);
        
        if (nums.length == 0) {
            return result;
        }
        
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;
                }
                end = i; 
            }
        }
        
        if (start != -1) {
            result[0] = start;
            result[1] = end;
        }
        
        return result;
    }
    public static void main(String args[])
    {
        int[] nums = {1};
        int target = 1;
        Solution obj = new Solution();
        int[] res = obj.searchRange(nums, target);
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ladderLength'");
    }
}
