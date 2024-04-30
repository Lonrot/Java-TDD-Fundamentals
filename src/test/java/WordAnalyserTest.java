import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;




class WordAnalyserTest {
    //WordAnalyserTest analyser = new WordAnalyserTest();
    //String input = "This is some example test data - come up with your own!";

    @Test
    void findLongestWords() {
    }

    @Test
    void calculateLetterFrequency() {
        WordAnalyser calAnalyser = new WordAnalyser();
        assertEquals(1,calAnalyser.calculateLetterFrequency("sfgwegs werg").get('f'));
    }
}