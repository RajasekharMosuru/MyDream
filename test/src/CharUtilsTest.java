import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharUtilsTest {

    @Test
    void testSecondNonRepeatedCharacter_NormalCase() {
        String input = "maharajahs rumours";
        Character expected = 'o';
        assertEquals(expected, FirstNonRepeatedChar.theNonRepeatedCharactor(input));
    }

    @Test
    void testSecondNonRepeatedCharacter_SingleNonRepeatedChar() {
        String input = "aabbc"; // only 'c' is non-repeated
        assertNull(FirstNonRepeatedChar.theNonRepeatedCharactor(input));
    }

    @Test
    void testSecondNonRepeatedCharacter_MultipleNonRepeated() {
        String input = "abcde"; // all non-repeated
        assertEquals('b', FirstNonRepeatedChar.theNonRepeatedCharactor(input)); // second = 'c'
    }

    @Test
    void testSecondNonRepeatedCharacter_NoNonRepeated() {
        String input = "aabbcc";
        assertNull(FirstNonRepeatedChar.theNonRepeatedCharactor(input));
    }


    @Test
    void testSecondNonRepeatedCharacter_EmptyString() {
        assertNull(FirstNonRepeatedChar.theNonRepeatedCharactor(""));
    }

    @Test
    void testSecondNonRepeatedCharacter_NullInput() {
        assertNull(FirstNonRepeatedChar.theNonRepeatedCharactor(null));
    }
}