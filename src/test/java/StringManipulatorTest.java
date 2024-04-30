import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    StringManipulator stm = new StringManipulator();

    @Test
    void reverseString() {
    }

    @Test
    void isPalindrome() {
        assertEquals(false, stm.isPalindrome("ion"));

    }
}