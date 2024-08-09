 public class Find_Sequence 
{
    public static void main(String args[])
    {   
         int arr[] = { 1,2,3,4,20,21};
         int len = arr.length;
         int[][] temp = new int[len][len];
         int row = 0, col = 0;
         for (int i = 1; i < len; i++) 
        {
            if (arr[i] == arr[i - 1] + 1) 
            {
                if (col == 0) 
                {
                    temp[row][col++] = arr[i - 1];
                }
                temp[row][col++] = arr[i];
            } 
            else 
            {
                row++;
                col = 0;
                
            }
        }

         for (int a = 0; a <= row; a++) 
         {
          for (int b = 0; b < len  ; b++) 
          {
              System.out.print(temp[a][b] + " ");
          }
          temp[0][]
        
          System.out.println();
         }
    } 
  }

