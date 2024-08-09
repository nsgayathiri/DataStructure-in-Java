import java.security.InvalidAlgorithmParameterException;

public class ASCII_value
{
  
    public static void main(String args[])
    {   
        String str = "gayathiri";
        int[] count = new int[125];
        str.toLowerCase();
        for ( int i = 0 ; i <= (str.length()-1) ; i++)
        {
            count[((int)str.toCharArray()[i])]++;
        }

        for ( int i = 0 ; i <= (count.length-1) ; i++)
        {
           if ( count[i] > 1)
           {
                System.out.println(" repeated letter : "+ (char)i + " and its count : "+count[i]);
           }
           else if ( count[i] == 1)
           {
                System.out.println(" non - repeated letter : " + (char)i);
           }
        }

        System.out.println(((int)str.toCharArray()[0]));

    }
}