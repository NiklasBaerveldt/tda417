import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    void isPalindrome() {
        String s = "AYYYYYYA";
        assertTrue(IsPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeConsideringOnlyLetters() {
        String s = "Madam, I'm Adam!";
        assertTrue(IsPalindrome.isPalindromeConsideringOnlyLetters(s));
    }
}