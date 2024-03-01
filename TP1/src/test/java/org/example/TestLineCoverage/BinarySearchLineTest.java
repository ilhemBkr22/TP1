package org.example.TestLineCoverage;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;

import org.example.BinarySearch;
import org.junit.Test;

public class BinarySearchLineTest {

    @Test
    public void testBinarySearchElementPresent() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testBinarySearchElementNotPresent() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(-1, BinarySearch.binarySearch(array, 6));
    }


    @Test(expected = NullPointerException.class)
    public void testBinarySearchWithNullArray() {
        BinarySearch.binarySearch(null, 5);
    }
}
