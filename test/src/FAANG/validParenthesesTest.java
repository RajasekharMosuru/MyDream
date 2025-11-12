package FAANG;

import SolveDSAProblems.FAANG.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class validParenthesesTest {

    @Test
    void testValidSimple() {
        assertTrue(ValidParentheses.validParathes("()"));
    }

    @Test
    void testValidNested() {
        assertTrue(ValidParentheses.validParathes("({[]})"));
    }

    @Test
    void testInvalidMixedOrder() {
        assertFalse(ValidParentheses.validParathes("([)]"));
    }

    @Test
    void testIncompleteOpen() {
        assertFalse(ValidParentheses.validParathes("((("));
    }

    @Test
    void testIncompleteClose() {
        assertFalse(ValidParentheses.validParathes("())"));
    }

    @Test
    void testEmptyString() {
        assertTrue(ValidParentheses.validParathes(""));
    }

    @Test
    void testSingleOpeningBracket() {
        assertFalse(ValidParentheses.validParathes("("));
    }

    @Test
    void testSingleClosingBracket() {
        assertFalse(ValidParentheses.validParathes("]"));
    }

    @Test
    void testDifferentTypesOfBrackets() {
        assertTrue(ValidParentheses.validParathes("{[()()]}"));
    }
}
