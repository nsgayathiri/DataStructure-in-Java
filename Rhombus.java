import java.util.Scanner;
public class Rhombus 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row value:");
        int row = scan.nextInt();
        System.out.println("Enter the col value");
        int col = scan.nextInt();
    
        for (int i=1; i<= row; i++) {
			for (int j=1 ; j<=i ; j++)  
				System.out.print(" ");
			for (int j=1 ; j<=col; j++) 
				System.out.print("*");
			System.out.println();
		}


    }
    
}
