
import java.util.Scanner;
public class sum_of_Diagnol 
{
    public static int Solution(int[][] arr)
    { 
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length ; j++)
            {
                if(i == j)
                {
                    sum += arr[i][j];
                }
            }
        }
        return sum;

    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length ; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        // int[][] arr ={
        //                 {1,2,4,6,9},
        //                 {5,2,8,9,0},
        //                 {7,2,3,6,9},
        //                 {4,7,9,4,7},
        //                 {1,9,2,1,5}
        //                };
        sum_of_Diagnol obj = new sum_of_Diagnol();
        int fin = obj.Solution(arr);
        System.out.println(fin);
    }
}
