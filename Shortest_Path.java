import java.util.*;

class Shortest_Path{
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        System.out.println(n);
        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) 
        {
            return -1;
        }

        int[][] directions = {
            {0, 1}, {1, 0}, {0, -1}, {-1, 0},
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        grid[0][0] = 1; // Mark as visited

        int distance = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.println("Size of the Queue:"+size);
            distance++;
            
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int r = cell[0];
                int c = cell[1];
                
               
                System.out.println("Processing cell at row " + r + ", column " + c + " with distance " + distance);

                if (r == n - 1 && c == n - 1) {
                    return distance;
                }

                for (int[] dir : directions) {
                    int newRow = r + dir[0];
                    System.out.print(newRow);
                    int newCol = c + dir[1];
                    System.out.print(newCol);

                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
                        grid[newRow][newCol] = 1; // Mark as visited
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
        }
        
        return -1;
    }

        public static void main(String[] args) {
           Shortest_Path shortest_Path = new Shortest_Path();
            
            // Test cases
            int[][] grid1 = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
            };
            
            int[][] grid2 = {
                {0, 1},
                {1, 0}
            };
            
            int[][] grid3 = {
                {1, 0},
                {0, 1}
            };
            
            // Test the shortestPathBinaryMatrix method
            System.out.println("Shortest Path for grid1: " + shortest_Path.shortestPathBinaryMatrix(grid1)); // Expected output: 4
            System.out.println("Shortest Path for grid2: " + shortest_Path.shortestPathBinaryMatrix(grid2)); // Expected output: 2
            System.out.println("Shortest Path for grid3: " + shortest_Path.shortestPathBinaryMatrix(grid3)); // Expected output: -1
        }
}
