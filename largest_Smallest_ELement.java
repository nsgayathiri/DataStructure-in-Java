public class largest_Smallest_ELement
{ public static void main(String args[])
    {

    
    int[] arr = {49,501, 1, 62,98,900, 120};
    for(int i = 0 ; i <= arr.length - 1 ; i++)
    {
        for(int j = i + 1 ; j <= arr.length - 1 ; j++ )
        {
        if(arr[i] > arr[j])
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    }
    System.out.println("Smallest Number is:" +arr[0] );
    System.out.println("Largest Number is:" +arr[arr.length - 1]);
}
    
}
