public class Number_of_moves_to_Convert_a_String {
    public static void main(String[] args) {
        String s = "X0000";
        int moves = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            for (int j = i + 1; j <= s.length() - 2; j++) {
                for (int k = j + 1; k <= s.length() - 1; k++) {
                    if (s.charAt(i) == 'X' || s.charAt(j) == 'X' || s.charAt(k) == 'X') {
                        moves++;
                    }
                }
            }
        }
        System.out.println(moves);
    }
}
