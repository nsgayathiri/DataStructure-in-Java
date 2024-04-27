public class Find_the_Wealth {
    
    public static void main(String args[]) {
        int[][] arr = {
            {1, 2, 3},
            {3, 2, 1},
            {34,1,5},
        };
        Find_the_Wealth solution = new Find_the_Wealth();
        int maxWealth = solution.maximumWealth(arr);
        System.out.println(maxWealth);
    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int row = 0; row < accounts.length; row++) {
            int total = 0; 
            for (int col = 0; col < accounts[row].length; col++) {
                total += accounts[row][col]; 
            }
            maxWealth = Math.max(maxWealth, total); 
        }
        return maxWealth;
    }
}
