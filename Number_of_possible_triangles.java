public class Number_of_possible_triangles 
{
    public static int Solution(int[] arr)
    {
        int count = 0 ;
        for(int i = 0 ; i < arr.length - 2 ; i++)
        {
            for(int j = i + 1 ; j <arr.length - 1 ; j++)
            {
                for(int k = j + 1 ; k < arr.length ; k++)
                {
                    if(arr[i] + arr[j] > arr[k] && arr[k] + arr[i] > arr[j] && arr[j] + arr[k] > arr[i])
                    {
                        count++;
                    }
                   
                }
            }
        
        }
        return count;
    }
    public static void main(String args[])
    {
        int[] arr = {6,4,9,7,8};
        Number_of_possible_triangles obj = new Number_of_possible_triangles();
        int count = obj.Solution(arr);
        System.out.println(count);

    }
    
}
