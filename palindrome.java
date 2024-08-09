public class palindrome 
{
    public static void main(String args[])
    {
        String str = "madam";
        int i  = 0, j = str.length()-1;
        boolean isPalindrome = true;
        while(i < j && i!=j)
        {
              if(str.charAt(i) == str.charAt(j))
              {
                i++;
                j--;
              }
              else
              {
                System.out.println("Given String is not a Palindrome");
                isPalindrome = false; 
                break;
              }
        }
        if(isPalindrome)
        {
            System.out.println("Given String is a Palindrome"); 
        }
    
    }
    
}
