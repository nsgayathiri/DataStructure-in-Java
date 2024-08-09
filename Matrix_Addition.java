import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println("Enter the length of the row:");
            row = scan.nextInt();
            System.out.println("Enter the length of the column:");
            col = scan.nextInt();

            if (row == col) {
                break;
            } else {
                System.out.println("Row and column lengths must be equal. Please enter again.");
            }
        }

        int[][] arr_1 = new int[row][col];
        int[][] arr_2 = new int[row][col];
        int[][] add = new int[row][col];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr_1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                arr_2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                add[i][j] = arr_1[i][j] + arr_2[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
