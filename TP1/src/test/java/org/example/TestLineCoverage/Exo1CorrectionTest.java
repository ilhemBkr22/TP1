package org.example.TestLineCoverage;

import static org.junit.jupiter.api.Assertions.*;



import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo1Correction;
import org.junit.Test;

public class Exo1CorrectionTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Exo1Correction.isPalindrome("radar"));
        assertTrue(Exo1Correction.isPalindrome("12321"));
        assertFalse(Exo1Correction.isPalindrome("hello"));
        assertFalse(Exo1Correction.isPalindrome("world"));
        assertFalse(Exo1Correction.isPalindrome("12345"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsPalindromeNullString() {
        Exo1Correction.isPalindrome(null);
    }

}
