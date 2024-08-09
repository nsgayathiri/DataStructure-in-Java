import java.util.LinkedList;
import java.util.Queue;

public class SimpleNumberSystem {

    static String findNthNumber(int n) {
        
        Queue<String> queue = new LinkedList<>();
        
        queue.add("3");
        queue.add("4");
    
        String nthNumber = "";
        
        for (int i = 0; i < n; i++) {
            
            nthNumber = queue.poll();
            
           
            queue.add(nthNumber + "3");
            queue.add(nthNumber + "4");
        }
        
        return nthNumber;
    }

    // Driver program
    public static void main(String[] args) {
        int n = 10; // Example: find the 10th number
        System.out.println("The " + n + "th number in the number system with only 3 and 4 is: " + findNthNumber(n));
        
        // Test the first 16 numbers
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "th number: " + findNthNumber(i));
        }
    }
}
