public class Length_of_longest_balanced_parentheses{
    static int Solution(String str,int n)
    {
        int max = 0;
        int sum = 0 ;
       
        for(int i = 0 ; i < n ; i++)
        {
            if(str.charAt(i) == '(')
            {
                sum += 1;
            }
            else
            {
                sum -= 1;
            }
            if(sum==0)
            {
                max = i;
            }

        }
        return max + 1;

    }

 public static void main(String[] args)
 {
     String str = "((()())())((";
     int n = str.length();

     System.out.println(Solution(str, n)); // Output: 10
 }
}


    

