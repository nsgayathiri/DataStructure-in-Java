public class SpecialArrayReversal {
    public static void main(String[] args) {
        String s = "A&B%CD@";
        StringBuilder result = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
  
            if (!Character.isLetter(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetter(s.charAt(right))) {
                right--;
                continue;
            }
  
            result.setCharAt(left, s.charAt(right));
            result.setCharAt(right, s.charAt(left));
            left++;
            right--;
        }

        System.out.println(result.toString());
    }
}
