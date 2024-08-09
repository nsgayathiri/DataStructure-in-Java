import java.util.*;

public class Longest_Substring_without_Repeating_Character {

    public int lengthOfLongestSubstring(String str) {
        int n = str.length();
        int maxLen = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();

        while (i < n && j < n) {
            if (!set.contains(str.charAt(j))) 
            {   
                set.add(str.charAt(j));
                j++;
                maxLen = Math.max(maxLen, j - i);
                
            } 
            else      
            {   
                set.remove(str.charAt(i));
                i++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) 
    {
        String str = "abcabcbb";
        var obj = new Longest_Substring_without_Repeating_Character();
        System.out.println(obj.lengthOfLongestSubstring(str));
    }
}
