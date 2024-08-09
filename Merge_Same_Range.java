public class Merge_Same_Range 
{
    public static void main(String args[])
    {
        int[][] arr =  {{2,4},
                        {6,9},
                        {1,7},
                        {4,7}
                       };
            
        for(int i = 1; i < arr.length ; i++)
        {
            for(int j = 1 ;j <= arr[i].length ;j++)
            {
                 while((i+1) <= arr.length)
                 {
                    if(arr[i][j] <= arr[i+1][j] && j+1 <= j)
                    {
                        if(arr[i] >= arr[i+1])
                        {
                            i = i+1;
                        }

                    }
                 }
            }
        }
    }
    
}
