public class Heap_sort 
{
    public static void heapsort(int[] arr, int len)
    {
        // Build max heap
        for(int i = len / 2 - 1; i >= 0; i--)
        {
            maxheap(arr, len, i);
        }
        // Extract elements from heap
        for(int i = len - 1; i >= 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxheap(arr, i, 0);
        }
    }

    public static void maxheap(int[] arr, int len, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if(left < len && arr[left] > arr[largest])
        {
            largest = left;
        }
        if(right < len && arr[right] > arr[largest])
        {
            largest = right;
        }
        if(largest != i)
        {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            // Recursively heapify the affected sub-tree
            maxheap(arr, len, largest);
        }
    }

    public static void main(String args[])
    {
        int[] arr = {12, 20, 7, 9, 30};
        int len = arr.length;
        heapsort(arr, len);

        // Print the sorted array
        for(int i = 0; i < len; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
