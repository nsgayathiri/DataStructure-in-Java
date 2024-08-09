public class Hollow_Sqr_Pattern 
{
    public static void main(String[] args) 
    {
        
    
    int n = 5;
    for(int i = 0 ; i <= n - 1 ;i++)
    {
        for(int j = 0 ; j <= n - 1 ; j++)
        {
            if(i==0 || i== n-1)
            {
                while(j <= (n -1))
                {
                    System.out.print("*");
                    j++;
                }
                break;
            }
            else
            {
                if(j == 0 || j == (n-1))
                {
                    System.out.print("*");

                }
                else
                {
                    System.out.print(" ");

                }
            }
        }
        System.out.println();
    }
}
    
}
