package org.example.TestBranchCverage;

import static org.junit.jupiter.api.Assertions.*;


import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanNumeralBranchTest {
        @Test
        void testToRoman() {
            assertEquals("I", RomanNumeral.toRoman(1));
            assertEquals("IV", RomanNumeral.toRoman(4));
            assertEquals("IX", RomanNumeral.toRoman(9));
            assertEquals("XL", RomanNumeral.toRoman(40));
            assertEquals("XC", RomanNumeral.toRoman(90));
            assertEquals("CD", RomanNumeral.toRoman(400));
            assertEquals("CM", RomanNumeral.toRoman(900));
                   }

        @Test
        void testToRomanOutOfRange() {
            assertThrows(IllegalArgumentException.class, () -> {
                RomanNumeral.toRoman(0);
            });
            assertThrows(IllegalArgumentException.class, () -> {
                RomanNumeral.toRoman(4000);
            });
        }


}