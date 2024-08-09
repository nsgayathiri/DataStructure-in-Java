import java.util.*;

public class balancedParenthesis  {

    public static int check(String str) {
        Stack<Character> st = new Stack<>();
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
                st.push(s[i]);
            } else if (s[i] == ')' || s[i] == ']' || s[i] == '}') {
                if (st.isEmpty()) {
                    return 0;
                } else {
                    char c = st.pop();
                    if ((s[i] == ')' && c == '(') || (s[i] == ']' && c == '[') || (s[i] == '}' && c == '{')) {
                        continue;
                    } else {
                        return 0;
                    }
                }
            }
        }
        if (st.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String str = "()(())()";
        if (check(str) == 0) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}
