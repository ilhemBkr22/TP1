package org.example;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;

public class Exo1CorrectionBrancheTest {





    @Test
    public void testIsPalindromeWithPalindrome() {
        assertTrue(Exo1Correction.isPalindrome("anna"));
    }
    @Test
    public void testIsPalindromeWithNonPalindrome() {
        assertFalse(Exo1Correction.isPalindrome("hello"));
        assertFalse(Exo1Correction.isPalindrome("mama"));
        assertFalse(Exo1Correction.isPalindrome("54687"));
    }
    @Test
    public void testIsPalindromeWithPalindromeUppercase() {
        assertTrue(Exo1Correction.isPalindrome("ANNA"));
    }



    @Test(expected = NullPointerException.class)
    public void testIsPalindromeWithNull() {
        Exo1Correction.isPalindrome(null);
    }

}
