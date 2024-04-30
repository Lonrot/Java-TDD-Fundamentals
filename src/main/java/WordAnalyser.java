import java.util.Map;

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
        return null;
    }
}