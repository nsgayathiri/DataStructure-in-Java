import java.util.Scanner;

public class character_hash{

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        
       
        int[] hash = new int[26]; 

        for(int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                hash[ch[i] - 'a']++; 
            }
        }
        
        for (int i = 0; i < hash.length; i++) {
            if(hash[i] > 0) {
                char character = (char) ('a' + i);
                System.out.println("Character " + character + " occurs " + hash[i] + " times");
            }
        }
    }
}
