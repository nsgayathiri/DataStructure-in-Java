public class pyramid_Number 
{
    public static void main(String args[])
    {
        int n = 4;
        for(int i = 0 ; i <= n ; i++)
        {
            for(int j = 0 ; j <= n-i ; j++)
            {
                System.out.print("");
            }
            for (int k = 1; k <= i; k++)  
            {  
            System.out.print("k");
            
             }  
            for (int m = i-1; m >=1; m--)  
            {    
            
                System.out.print(" m");
  
            } 
            System.out.println("");

        }

    }
    
}
