import java.util.Arrays;
import java.util.HashMap;
public class Smallest_Greatest_Element_in_Whole_Array
{
    public static int[] greaterElement (int arr[], int n) 
    {
     
        HashMap<Integer,Integer> nextELement = new HashMap<>();
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        for(int i  = 0 ; i <= n - 1 ; i++)
        {
            nextELement.put(sortedArr[i],sortedArr[i+1]);
        }
        nextELement.put(sortedArr[n-1] , -10000000);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = nextELement.get(arr[i]);
        }
        
        return result;

    }
    public static void main(String args[])
    {
        int[] arr = {6, 3, 9, 8, 10, 2, 1, 15, 7};
        int n = arr.length;
        Smallest_Greatest_Element_in_Whole_Array obj = new Smallest_Greatest_Element_in_Whole_Array();
        int[] res = obj.greaterElement(arr, n);

    }
    
    
}

    

