import java.util.*;

public class ReorderWords {
    public static void main(String[] args) {
        String input = "is1 this0 test3 a2";
        String[] words = input.split(" ");
        
        TreeMap<Integer, String> map = new TreeMap<>();
        
        for (String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            String actualWord = word.substring(0, word.length() - 1);
            map.put(index, actualWord);
        }
        
        StringBuilder result = new StringBuilder();
        for (String word : map.values()) {
            result.append(word).append(" ");
        }
        
        // Remove the trailing space
        System.out.println(result.toString().trim());
    }
}
