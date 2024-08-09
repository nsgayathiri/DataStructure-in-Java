import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordLadder
{
    public int ladderLength(String beginWord, String endWord, List<String> wordList) 
    {
        int j = 0;
        List<String> finalList = new ArrayList<>();
        
        if (!wordList.contains(endWord)) 
        {
            return 0;
        }
        
        while (j < wordList.size()) 
        {
            int count_1 = 0;
            int count_2 = 0;
            String word = wordList.get(j);
            
            for (int i = 0; i < word.length(); i++) 
            {
                if (i < beginWord.length() && beginWord.charAt(i) != word.charAt(i)) 
                {
                    count_1++;
                }
                if (i < endWord.length() && endWord.charAt(i) != word.charAt(i)) 
                {
                    count_2++;
                }
            }
            
            if (count_1 == 1 && count_2 > 1) 
            {
                finalList.add(word);
                beginWord = word;
                j = -1; 
            } 
            else if (count_2 == 1) 
            {
                if (!finalList.contains(endWord)) 
                {
                    finalList.add(endWord);
                }
                break;
            }
            j++;
        }
        
        int ans = finalList.size() + 1; 
        return ans;
    }

    public static void main(String[] args) {
        WordLadder solution = new WordLadder();

        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int result = solution.ladderLength(beginWord, endWord, wordList);
        System.out.println("Ladder length: " + result);
    }  
}


    

