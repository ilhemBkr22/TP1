package org.example.TestConditionCoverage;

import org.example.AnagramCorrection;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramCorrectionConditionTest {
    @Test
    public void testIsAnagramWithValidAnagram() {
        assertTrue(AnagramCorrection.isAnagram("chien", "niche"));
    }

    @Test
    public void testIsAnagramWithLenghtDifferentNonAnagram() {
        assertFalse(AnagramCorrection.isAnagram("mama", "frere"));
    }

    @Test
    public void testIsAnagramWithNullString1() {
        assertThrows(NullPointerException.class, () -> AnagramCorrection.isAnagram(null, "mama"));
    }
    @Test
    public void testIsAnagramWithSameLenghtNonAnagram() {
        assertFalse(AnagramCorrection.isAnagram("mama", "frer"));
    }
    @Test
    public void testIsAnagramWithNullString2() {
        assertThrows(NullPointerException.class, () -> AnagramCorrection.isAnagram("mama", null));
    }


    static class RomanNumeralConditionTest {

    }
}