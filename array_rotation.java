public class array_rotation 
{
    public static void main(String args[])
    {
        int[] arr = {76,90,45,60,70,80};
        int k = 3;
        int[] newarr = new int[arr.length];
        int j = 0;
        for(int i = k ; i <= arr.length - 1 ;i++)
        {
            newarr[j] = arr[i];
            j++;
        }
        for(int i = 0 ; i <= k - 1 ; i++)
        {
            newarr[j] = arr[i];
            j++;
        }

        for(int i = 0 ; i <= newarr.length - 1 ;i++)
        {
            System.out.print(newarr[i] + " ");
        }
    }
    
}
