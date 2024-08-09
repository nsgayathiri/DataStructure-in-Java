import java.util.Stack;

class valid_Parenthesis_String {
    public boolean checkValidString(String s) {
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') 
            {
                openStack.push(i);
            } 
            else if (ch == '*') 
            {
                starStack.push(i);
            } 
            else if (ch == ')') 
            {
                if (!openStack.isEmpty()) 
                {
                    openStack.pop();
                } 
                else if (!starStack.isEmpty()) 
                {
                    starStack.pop();
                } 
                else 
                {
                    return false; 
                }
            }
        }
     
        while (!openStack.isEmpty()) 
        {
            if (starStack.isEmpty()) 
            {
                return false; 
            } 
            else if (openStack.peek() < starStack.peek()) 
            {   Integer test = openStack.peek();
                System.out.println(test);
                openStack.pop();
                starStack.pop();
            } 
            else 
            {
                return false; 
            }
        }

        return true;
    }
    public static void main(String args[])
    {
        String str = "(*))";
        valid_Parenthesis_String solution = new valid_Parenthesis_String();
        boolean res = solution.checkValidString(str);
        System.out.println(res);
    }
}
