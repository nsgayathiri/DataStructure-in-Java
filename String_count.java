public class String_count 
{
public static void main(String args[])
{
  String str = "AAAABBCDDDE";
  int len = str.length();
  int count ;
  StringBuilder sb = new StringBuilder();
  for(int i = 0 ; i <= len - 1; i=i+count)
  {
    count = 0;
    for(int j = 0 ; j <= len - 1 ; j++)
    {
        if(str.charAt(i) == str.charAt(j))
        {
            count++;
        }
    }

    if(count > 1)
    {
       sb.append(str.charAt(i)).append(count);
    }
    else
    {
        sb.append(str.charAt(i));
    }
  }   
  System.out.println(sb.toString());
}
}
