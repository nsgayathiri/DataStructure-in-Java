public class Inverted_Pyramid 
{
    public static void main(String args[])
    {
        int n = 5;
        for(int i=n;i>=1;i--)
	     {
	         for(int j=i;j<n;j++)
	            System.out.print(" ");
	         
	         for( int s=1;s<=(2*i-1);s++)
	            System.out.print("*");
	         
	       System.out.println("");
	     } 

    }
    
}
