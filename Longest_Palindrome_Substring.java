import java.util.TreeMap;

public class Longest_Palindrome_Substring 
{
    public String longestPalindrome(String str) 
    {
        StringBuilder sb = new StringBuilder();
        TreeMap<String, Integer> tree = new TreeMap<>((s1, s2) -> s2.length() - s1.length());
        
      
        for (int s = 0; s < str.length(); s++) 
        {
            for (int j = s; j < str.length(); j++) 
            {
                if (isPalindrome(str, s, j)) 
                {
                    sb.setLength(0);
                    sb.append(str, s, j + 1);
                    tree.put(sb.toString(), sb.length());
                }
            }
        }

        return tree.firstKey();
    }

    public boolean isPalindrome(String str, int left, int right) 
    {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;    
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "cbbd";
        Longest_Palindrome_Substring obj = new Longest_Palindrome_Substring();
        String res = obj.longestPalindrome(str);
        System.out.println(res);
    }
}
