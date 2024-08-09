class PangramCheck 
{
    public boolean checkIfPangram(String sentence) 
    {
        boolean isPangram = true;
        int[] arr = new int[26];
        for(int i = 0 ; i <= sentence.length()- 1; i++)
        {
           char ch = sentence.charAt(i);
           int value = ch - 97;
           arr[value]++; 
        }
        for(int i = 0 ; i <= arr.length - 1; i++)
        {
            if(arr[i] == 0)
            {
                isPangram = false;
                break;
            }
        }
        if(isPangram)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String args[])
    {
        String sentence = "thequickbabccrownfoxjumpsoverthelazydog";
        PangramCheck obj = new PangramCheck();
        System.out.println(obj.checkIfPangram(sentence));
    }
}
