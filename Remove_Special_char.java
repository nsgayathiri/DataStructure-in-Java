public class Remove_Special_char 
{
    
    public static void main(String args[])
    {
        String str = "Gayathiri#/>_2003@gmail.com";
        for(int i = 0 ; i <= str.length()-1 ; i++)
        {
            char ch = str.charAt(i);
            StringBuilder sb = new StringBuilder();
     
            if((int)ch >= 97 && (int)ch <= 122 || (int)ch >= 65 && (int)ch <= 90)
            {
               sb.append(ch);
            }
            System.out.print(sb.toString());
        }
    }
    
}
