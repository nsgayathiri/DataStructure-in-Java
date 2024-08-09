import java.util.Arrays;
import java.util.HashMap;

public class highest_count_of_element 
{
    public static int[] Solution(int[] arr)
    {
        int count, max = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        

         for(int i = 0 ; i < arr.length ; i++)
         {
            count = 1;
        
            for(int j = i + 1 ; j < arr.length ; j++)
            {
              if(arr[i] == arr[j])
              {
                count++;
              }

            }
            map.put(arr[i] , count);
         }
        for (Integer i: map.values())
        {
        Sort_key_values(i);
        }
        int[] fin_arr = new int[map.length];

        public static int Sort_key_values(Integer i)
        {
         if(max <= i)
         {
            max = i;
         }   
        }
       
    }

         


    }
    public static void main(String arg[])
    {
        int[] arr = {3,4,2,3,16,3,15,16,15,15,16,2,3};
        highest_count_of_element obj = new highest_count_of_element();
        int[] res = obj.Solution(arr);
        System.out.println(res);
        


    }
    
}
