package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Exo1CorrectionConditionTest {


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
