import java.util.Scanner;

public class Count_element_in_array {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scan.nextInt();
        }
        
        int[] hash = new int[13]; 

        for(int i = 0 ; i < n ; i++) {
            hash[arr[i]] += 1;
        }
        
        
        for (int i = 0; i < 13; i++) { 
            if (hash[i] > 0) {
                System.out.println("Element " + i + " occurs " + hash[i] + " times");
            }
        }
    }
}
