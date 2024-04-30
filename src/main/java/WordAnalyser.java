import java.security.Key;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.collections4.MapUtils;

public class WordAnalyser {
    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text

        String longestWord = "";

        String[] wordsArray = text.split(" ");
        int longestWordLength = 0;

        for (String word : wordsArray) {
            if (word.length() > longestWordLength) {
                longestWord = word;
                longestWordLength = word.length();
            }
        }
        return new String[]{longestWord};
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {

        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        Map<Character, Integer> output = new HashMap<>();
        text = text.toLowerCase().trim();
        text = text.replaceAll("\\s", "");
        //System.out.println(text);
        //Create new map
        //Iterate each Char
        //Compare each key with the array and increase the value if that key(char) is found.
        // by pulling the value of the Key and adding One
        //return the maps
        char[] str = text.toCharArray(); // Array type Char

        for(char c: str){
            if(!output.containsKey(c)){
                output.put(c,1);
            }else {
                output.put(c,output.get(c)+1);
            }
        }
        //System.out.println(output.toString());
        return output;
    }
}