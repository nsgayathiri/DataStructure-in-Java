public class string_reverse
 {
   public static void main(String args[])
   {
    String str = "Gayathiri";
    StringBuilder sb = new StringBuilder();
    // int len = str.length();
    // System.out.println(len);
    for(int i = str.length()-1 ; i >= 0 ; i--)
    {
        char ch = str.charAt(i);
        // System.out.println("ch : " +ch);
        sb.append(ch);
    }
    System.out.println("Reversed String: " + sb.toString());
   } 
}
