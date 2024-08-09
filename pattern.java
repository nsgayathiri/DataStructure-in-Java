import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number of rows and columns:");
        // int n = scan.nextInt();
        // rightangledtriangle(n); // Call the method for the right-angled triangle

        // System.out.println("Enter the number of rows and columns:");
        // int m = scan.nextInt();
        // boxpattern(m); // Call the method for the box pattern

        // System.out.println("Enter the number of rows and columns:");
        // int o = scan.nextInt();
        // inverted_right_triangle(o); // Call the method for the inverted right triangle

        // System.out.println("Enter the number of rows and columns:");
        // int p = scan.nextInt();
        // rightangledtriangle_in_numbers(p);

        // System.out.println("Enter the number of rows and columns:");
        // int q = scan.nextInt();
        // pattern4(q);

        // System.out.println("Enter the number of rows and columns:");
        // int r = scan.nextInt();
        // pattern5(r);

        // System.out.println("Enter the n value for diamond pattern:");
        // int s = scan.nextInt();
        // diamond(s);

        System.out.println("Enter the n value for pyramid pattern:");
        int t = scan.nextInt();
        pyramid(t);

        System.out.println("Enter the n value for pyramid pattern:");
        int u = scan.nextInt();
        box_Number(u);
        
        
    }
    // Right trianglr pattern
    static void rightangledtriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
   //Box Pattern
    static void boxpattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //inverted right traingle
    static void inverted_right_triangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n+1-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightangledtriangle_in_numbers(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) 
    {
        for (int row = 1; row <= 2 * n; row++) 
        {
            int col_value = row <= n ? row : 2*n-row;
            for (int col = 1; col <= col_value; col++)
             {
            
                System.out.print("*");
                
            }
    
            System.out.println();
        }
    }

   
    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void diamond(int n )
    {
        for(int row=0;row < 2*n ; row++)
        {
            int total_col = row > n ? 2*n-row : row;
            int space = n - total_col;
            for(int s = 0; s < space; s++)
            {
                System.out.print(" ");          
            }
        for(int col = 0 ; col < total_col ; col++)
        {
            System.out.print("* ");      
        }
        System.out.println();
    }
    }
    static void pyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for(int space = 0 ; space < n - row; space++)
            {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for(int col = 2 ; col <= row ; col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void box_Number(int n )
    {   n = 2*n;
        for(int row = 0; row <= n ; row++)
        {
            for(int col = 0 ; col <= n ;col++)
            {
                int EveryIndex = Math.min(Math.min(row,col), Math.min(n - row, n -col));
                System.out.print(EveryIndex + " ");
            }
            System.out.println();
        }
    }


    
}
