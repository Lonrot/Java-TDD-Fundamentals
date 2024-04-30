import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {
    WordAnalyser analyser = new WordAnalyser();
    String input = "OMGIAMSOLONG 2dasdasda fdsd";

    @Test
    void findLongestWords() {
        String[] StringArrayOne = new String[]{"longest"};
        String[] StringArrayTwo =new String [] {"Cuatro"};
        String[] StringArrayThree = new String[] {"OMGIAMSOLONG"};


        assertArrayEquals(StringArrayOne,analyser.findLongestWords("I'm a test with the longest word"));
        assertArrayEquals(StringArrayTwo, analyser.findLongestWords("Uno Dos Tres Cuatro"));
        assertArrayEquals(StringArrayThree, analyser.findLongestWords("OMGIAMSOLONG but  not me :-)"));
        assertArrayEquals(StringArrayThree, analyser.findLongestWords(input));
    }

    @Test
    void calculateLetterFrequency() {
    }
}