package org.example.TestLineCoverage;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo1Correction;
import org.example.Palindrome;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
    public class PalindromeTest {

   @Test
        public void testIsPalindromeWithPalindromeUppercase() {
            assertTrue(Palindrome.isPalindrome("ANNA"));
        }



        @Test(expected = NullPointerException.class)
        public void testIsPalindromeWithNull() {
            Palindrome.isPalindrome(null);
        }



        @Test
        public void testIsPalindrome() {
            assertTrue(Palindrome.isPalindrome("anna"));
           // assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
            assertTrue(Palindrome.isPalindrome("12321"));
            assertFalse(Palindrome.isPalindrome("hello"));
            assertFalse(Palindrome.isPalindrome("mimi"));
            assertFalse(Palindrome.isPalindrome("12345"));
        }

         }


