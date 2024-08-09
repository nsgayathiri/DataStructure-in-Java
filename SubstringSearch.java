public class SubstringSearch {

    public static void main(String[] args) {
        String input = "WELCOMETOZOHOCORPORATION";
        char[][] array = create2DArray(input, 5, 5);
        String substring = "too";

        int[][] result = findSubstring(array, substring);

        if (result != null) {
            System.out.println("Start index: <" + result[0][0] + "," + result[0][1] + "> End index: <" + result[1][0] + "," + result[1][1] + ">");
        } else {
            System.out.println("Substring not found.");
        }
    }

    private static char[][] create2DArray(String string, int rows, int cols) {
        char[][] array = new char[rows][cols];
        int index = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (index < string.length()) {
                    array[r][c] = string.charAt(index);
                    index++;
                } else {
                    array[r][c] = ' ';  // fill with space if string length is shorter than array size
                }
            }
        }
        return array;
    }

    private static int[][] findSubstring(char[][] array, String substring) {
        int rows = array.length;
        int cols = array[0].length;
        int subLen = substring.length();

        // Search left to right
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c <= cols - subLen; c++) {
                if (matches(array, substring, r, c, 0, 1)) {
                    return new int[][]{{r, c}, {r, c + subLen - 1}};
                }
            }
        }

        // Search top to bottom
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r <= rows - subLen; r++) {
                if (matches(array, substring, r, c, 1, 0)) {
                    return new int[][]{{r, c}, {r + subLen - 1, c}};
                }
            }
        }

        return null;
    }

    private static boolean matches(char[][] array, String substring, int startRow, int startCol, int rowInc, int colInc) {
        for (int i = 0; i < substring.length(); i++) {
            if (Character.toLowerCase(array[startRow + i * rowInc][startCol + i * colInc]) != Character.toLowerCase(substring.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
