package de.ait.homework34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    private static final String HALLO_STRING = "Hallo ";

    @BeforeEach
    public void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    void testConcatenateHappyPath() {
        String result = stringProcessor.concatenate(HALLO_STRING, "Java");
        assertEquals("Hallo Java", result);
    }

    @Test
    void testConcatenateSecondParamNull() {
        String result = stringProcessor.concatenate(HALLO_STRING, null);
        assertEquals("Hallo null", result);
    }

    @Test
    void testConcatenateFirstParamNull() {
        String result = stringProcessor.concatenate(null, HALLO_STRING);
        assertEquals("nullHallo ", result);
    }

    @Test
    void testGetLengthHappyPath() {
        assertEquals(6, stringProcessor.getLength(HALLO_STRING));
    }

    @Test
    void testGetLengthHappyParamNull() {
        Assertions.assertThrows(NullPointerException.class,
                () -> {stringProcessor.getLength(null);});
    }

    @Test
    void testIsPalindromeTrue() {
        Assertions.assertTrue(stringProcessor.isPalindrome("HolloH"));
    }

    @Test
    void testIsPalindromeFalse() {
        Assertions.assertFalse(stringProcessor.isPalindrome(HALLO_STRING));
    }

    @Test
    void testReverseHappyPath() {
        assertEquals(" ollaH", stringProcessor.reverse(HALLO_STRING));
    }

    @Test
    void testReverseParamEmpty() {
        assertEquals("", stringProcessor.reverse(""));
    }

}
