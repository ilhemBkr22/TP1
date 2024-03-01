package org.example.TestConditionCoverage;

import org.example.BinarySearch;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchConditionTest {
    @Test
    public void testBinarySearchElementLowerThanMedPresent() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
    }
    @Test
    public void testBinarySearchElementUpperThanMedPresent() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(6, BinarySearch.binarySearch(array, 13));
    }
    @Test
    public void testBinarySearchElementLowerNotPresent() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(-1, BinarySearch.binarySearch(array, 0));
    }
    @Test
    public void testBinarySearchElementUppererNotPresent() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(-1, BinarySearch.binarySearch(array, 14));
    }



    @Test(expected = NullPointerException.class)
    public void testBinarySearchWithNullArray() {
        BinarySearch.binarySearch(null, 5);
    }

}