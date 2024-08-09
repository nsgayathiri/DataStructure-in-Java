public class Even_Digits 
{
    public static void main(String args[])
    {
      int[] arr = {23,7689,4,6,12}; 
      int ans = findNumbers(arr);
      System.out.println(ans);
    }
    static int findNumbers(int[] nums)
    {
        
        int count1 = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
           int count = 1;
           int Quo = nums[i] / 10;

           while( Quo != 0)
           {
            count++;
            Quo = Quo / 10;
           }
           
           if( count % 2 == 0)
           {
            count1++;
           }
        }
        return count1;

    }
}
