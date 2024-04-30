import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    StringManipulator manipulator = new StringManipulator();

    @Test
    void reverseString() {
        assertEquals("LEGNA",manipulator.reverseString("ANGEL"));
        assertEquals("NOI",manipulator.reverseString("ION"));
        assertEquals("NOON",manipulator.reverseString("NOON"));
        assertEquals("NIETSMMAR",manipulator.reverseString("RAMMSTEIN"));
    }

    @Test
    void isPalindrome() {

    }
}