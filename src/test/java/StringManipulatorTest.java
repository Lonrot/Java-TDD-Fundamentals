import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    StringManipulator manipulator = new StringManipulator();

    @Test
    @DisplayName("Reversed String test")
    void reverseString() {
        assertEquals("LEGNA",manipulator.reverseString("ANGEL"));
        assertEquals("NOI",manipulator.reverseString("ION"));
        assertEquals("NOON",manipulator.reverseString("NOON"));
        assertEquals("NIETSMMAR",manipulator.reverseString("RAMMSTEIN"));

    }

    @Test
    void isPalindrome() {
        assertEquals(false,manipulator.isPalindrome("sgdjgh"));
        assertEquals(true,manipulator.isPalindrome("ioerfreoi"));

    }
}