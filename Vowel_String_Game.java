class Vowel_String_Game
{
    public boolean doesAliceWin(String s) 
    {
        boolean Win = false;
        StringBuilder sb = new StringBuilder();
        int playercount = 1;
        for(int i = 0; i < s.length(); i++)
        {

            int count = 0;
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
            {
                count++;
            }
        
            if((count % 2 != 0 && count > 1) || (count % 2 == 0 && count >= 0 && playercount % 2 == 0))
            {
                for(int j = i ; j < s.length() ; j++)
                {
                   sb.append(j);
                }
            }
        }
            playercount++;

        if(sb.toString() != null)
        {
            String str = sb.toString();
            doesAliceWin(str);
        } 
        else
        {
           if(playercount % 2 == 0)
           {
             Win = false;
           }
           else
           {
             Win = true;
           }
        }
    
     return Win;
    }
    public static void main(String[] args)
    {
        String str = "leetcode";
        Vowel_String_Game solution = new Vowel_String_Game();
        boolean res = solution.doesAliceWin(str);
        System.out.println(res);
    }
   
}