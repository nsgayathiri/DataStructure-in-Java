public class Kth_Distinct_Element 
{
    public static String Solution(char[] str)
    {
       for(int i = 0 ; i <= str.length() - 1 ; i++)
       {
        for(int j = i+1 ; j <= str.length() ; j++)
        {
            if(str.charAt(i) == str.charAt(j))
            {

            }
        }
       }
    }
    public static void main(String[] args) 
    {
        char[] str = {"d","b","c","b","c","a"};
        Kth_Distinct_Element solution = new Kth_Distinct_Element();
        String res = solution.Solution(str);
        System.out.println(res);
    }
    
}
