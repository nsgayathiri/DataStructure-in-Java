import java.util.*;
public class Missing_Number 
{

    public static int Solution(int[] arr, int n)
    {
        
            for(int i = 0 ; i < n ; i++)
            {
              
               if(arr[i] != i+1)
               {
                return i+1;
               }
            }
            return 0;
        
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n = scan.nextInt();
        int[] arr = new int[n-1];
        System.out.println("Enter the array elements:");
        for(int i = 0 ; i < n-1 ; i ++)
        {
            arr[i] = scan.nextInt();
        }
        
        Missing_Number obj = new Missing_Number();
        int res_arr = obj.Solution(arr,n);
        
        System.out.println("Missing ELement is :" +res_arr);


    }
    
}
