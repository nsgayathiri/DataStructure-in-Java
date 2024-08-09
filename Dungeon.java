import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class  Dungeon  
{    
    public int calculateMinimumHP(int[][] dungeon) 
    {
        int rows = dungeon.length;
        int cols = dungeon[0].length;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] minHealth = new int[rows][cols]; 

        for (int[] row : minHealth) 
        {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        minHealth[0][0] = Math.max(1, 1 - dungeon[0][0]);

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, minHealth[0][0]});

        while (!queue.isEmpty()) 
        {
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];
            int health = cell[2];

            for (int[] dir : directions) 
            {
                int newRow = r + dir[0];
                int newCol = c + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) 
                {
                    int nextHealth = Math.max(1, health - dungeon[newRow][newCol]);
                    if (nextHealth < minHealth[newRow][newCol]) 
                    {
                        minHealth[newRow][newCol] = nextHealth;
                        queue.offer(new int[]{newRow, newCol, nextHealth});
                    }
                }
            }
        }

        return minHealth[rows - 1][cols - 1] + 1;
    }

        public static void main(String[] args) {
            Dungeon solution = new Dungeon();

            int[][] dungeon = 
            {
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}
            };

            int result = solution.calculateMinimumHP(dungeon);
            System.out.println("Minimum initial health required: " + result);
        }
    }
    

    

