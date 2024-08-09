public class Square_Number_Pattern {
    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        int n = 9;

        for (int i = 1; i <= row; i++) 
        {
            for (int j = 1; j <= col; j++) 
            {
                
                if ((i == 2 || i == 3) && j == 2) 
                {
                    System.out.print(i - 1);
                } 
                else 
                {
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }
}
