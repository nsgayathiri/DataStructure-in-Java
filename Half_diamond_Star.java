public class Half_diamond_Star 
{
    public static void main(String args[])
    {
        int row = 4;
        for(int i = 1; i <= (2*row-1) ; i++)
        {
            for(int j = 1; j <=i ; j++)
            {
                if(i > row)
                {
                    for(int k = 1;k <=( 2 * row - i) ;k++)
                    {
                        System.out.print("*");
                    }
                    break;
                }
                else
                {  

                    System.out.print("*");
                    
                }
            }
            System.out.println("");

        }
    }
    
}
