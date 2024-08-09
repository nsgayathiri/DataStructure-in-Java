public class Integer_Palindrome 
{
    public static void main(String args[])
    {
        int n = 54675;
        int res = 0;
        int quo = n;
        
        while(quo > 0)
        {
            int rem = quo % 10; 
            res= res * 10 + rem; 
            quo = quo/10;
        }
        
        if(res == n)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
               
        }
    }
    
}
