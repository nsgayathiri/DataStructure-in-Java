public class Diamond 
{
    
    public static void main(String args[])
    {
        int n = 4;
        for(int row=0;row < 2*n ; row++)
        {
            int total_col = row > n ? 2*n-row : row;
            int space = n - total_col;
            for(int s = 0; s < space; s++)
            {
                System.out.print(" ");          
            }
        for(int col = 0 ; col < total_col ; col++)
        {
            System.out.print("*");      
        }
        System.out.println();
    }
    }

    
}
