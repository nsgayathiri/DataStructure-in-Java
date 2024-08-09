public class To_Find_Substring 
{
    /**
     * @param args
     */

     
public static void main(String args[])
    {
       String str = "Gihiyri";
       String sub_string = "yir";
       boolean isSubString = false;
       int i = 0;
    

       for(int j = 0 ; j <= (str.length() - 1); j++)
    {
        System.out.println(" sol j : "+ j);
        System.out.println(" i : "+ i);
        if(sub_string.charAt(i) == str.charAt(j))
        {
            int k = j;
            int count = 0;
            while( k <= (str.length() - 1))
            {
                System.out.println(" sol k : "+ k);
                System.out.println(" i : "+ i);
                if(str.charAt(k) == sub_string.charAt(i))
                {
                  
                    if(count == (sub_string.length()-1) && i <= (sub_string.length() - 1))
                    {
                        System.out.println("Given String is the substring of the main string");
                        isSubString = true;
                        break;
                    }
                    i++;
                    k++;
                    count++;
                    
                }
               else
               {
                System.out.println(" break! ");
                break;
               }
               System.out.println(" sol k : "+ k);
               System.out.println(" i : "+ i);
            }
        }
        i=0;
        System.out.println(" eol j : "+ j);
        System.out.println(" i : "+ i);
        if(isSubString)
        {
            break;
        }
    }
    if(!isSubString)
    {
       System.out.println("NOt");
    }
 }
}



    // for(int j = 0 ; j <= str.length()-1 ; j++)
    // {
    //     System.out.println("sol :"+j);
    //     if(sub_string.charAt(i) == str.charAt(j))
    //     {
        
    //         if( !CompareTo(sub_string, str, i, j))
    //         {
    //             System.out.println("given is not subtring of the main string");
    //             isSubString = false;
    //             break;
    //         }
    //     }
    //     System.out.println("eol: "+j);
    // }
    // if(isSubString)
    // {
    //     System.out.println("given is subtring of the main string");
    // }
   
    // }

     
    // public static boolean CompareTo(String sub_string, String str, int i , int j)
    // {
    //     try {
    //         boolean isSubString = true;

    //         for(int k = j ; k <= (j + sub_string.length()-1) ; k++)
    //             {
    //                 System.out.println("sol k : "+ k);
    //                 if(sub_string.charAt(i) == str.charAt(k))
    //                 {
    //                     i++;
    //                     System.out.println("C");
    //                 }
    //                 else
    //                 {
    //                  System.out.println("D");
    //                  isSubString = false;
    //                     break;
    //                 }
    //                 System.out.println("eol k : "+ k);
    //             }
    //          return isSubString;
    
    //     } catch (Exception e) {
    //        e.printStackTrace();
    //     }
    //     return false;
    // }
       

