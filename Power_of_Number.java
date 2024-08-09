public class Power_of_Number 
{
    public static void main(String args[])
    {
        int pow = 3;
        int base = 5;
        int res = 1;

        for(int i = 0 ; i <= pow - 1 ; i++)
        {
            res *= base;
        }
        System.out.println(res);
    }
    
}
