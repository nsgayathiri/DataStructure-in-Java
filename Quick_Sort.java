public class Quick_Sort 
{
    static void quicksort(int[] arr, int lb, int ub)
    {
        int loc;
        if(lb < ub)
        {
            loc = partition(arr, lb, ub);
            quicksort(arr, lb, loc - 1);
            quicksort(arr, loc + 1, ub);
        }
    }

    static int partition(int[] arr, int lb, int ub)
    {
        int temp;
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while(start < end)
        {
            while(arr[start] <= pivot && start < ub)
            { 
                start++;
            }
            while(arr[end] > pivot)
            {
                end--;
            }
            if(start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end;
    }

    public static void main(String[] args) 
    {
        int[] arr = {15, 20, 7, 9, 30};
        int len = arr.length;
        quicksort(arr, 0, len - 1);

        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
