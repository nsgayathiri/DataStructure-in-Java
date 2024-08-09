class Zig_Zag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;  // Special case: no zigzag required
        }

        StringBuilder sb = new StringBuilder();
        char[][] res_arr = new char[numRows][s.length()];
        int char_count = 0;

        for (int i = 0; i < s.length(); i++) {
            // Fill downwards
            for (int j = 0; j < numRows && char_count < s.length(); j++) {
                res_arr[j][i] = s.charAt(char_count);
                char_count++;
            }
            // Move one step forward in columns
            if (char_count >= s.length()) break;
            i++;
            // Fill diagonally up (skip the last row)
            for (int j = numRows - 2; j >= 1 && char_count < s.length(); j--) {
                res_arr[j][i] = s.charAt(char_count);
                char_count++;
                i++;
            }
            i--; // Adjust column index after diagonal filling
        }

        // Collect the characters from the 2D array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (res_arr[i][j] != '\0') {
                    sb.append(res_arr[i][j]);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int numRows = 3;
        Zig_Zag_Conversion obj = new Zig_Zag_Conversion();
        System.out.println(obj.convert(str, numRows));
    }
}
