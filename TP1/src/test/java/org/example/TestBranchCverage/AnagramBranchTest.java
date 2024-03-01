package org.example.TestBranchCverage;

import org.example.AnagramCorrection;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramBranchTest {

    @Test
    public void testIsAnagramWithValidAnagram() {
        assertTrue(AnagramCorrection.isAnagram("chien", "niche"));
    }

    @Test
    public void testIsAnagramWithLenghtDifferentNonAnagram() {
        assertFalse(AnagramCorrection.isAnagram("mama", "frere"));
    }


    @Test
    public void testIsAnagramWithSameLenghtNonAnagram() {
        assertFalse(AnagramCorrection.isAnagram("mama", "frer"));
    }
    @Test
    public void testIsAnagramWithNullString() {
        assertThrows(NullPointerException.class, () -> AnagramCorrection.isAnagram("mama", null));
        assertThrows(NullPointerException.class, () -> AnagramCorrection.isAnagram(null, "mama"));
    }


}