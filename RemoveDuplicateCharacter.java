public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "acaabbbceddd";
        String result = removeDuplicates(str, 0);
        System.out.println(result);  // Output should be "ae"
    }

    public static String removeDuplicates(String str, int i) {
        // Base case: if index reaches the length of the string
        if (i >= str.length()) {
            return "";
        }

        int j = i + 1;

        // Check if the current character has any consecutive duplicates
        while (j < str.length() && str.charAt(i) == str.charAt(j)) {
            j++;
        }

        // If no duplicates were found, include the current character in the result
        if (j == i + 1) {
            return str.charAt(i) + removeDuplicates(str, j);
        } else {
            // If duplicates were found, skip all of them
            return removeDuplicates(str, j);
        }
    }
}
