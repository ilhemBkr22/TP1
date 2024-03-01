package org.example.TestConditionCoverage;

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConditionTest {
    @Test
    void testFizzBuzz_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void testFizzBuzz_5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void testFizzBuzz_15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }


    @Test
    void testFizzBuzz_1() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(-5);
        });
        assertEquals("n must be positive", exception.getMessage());
    }
    @Test
    void testFizzBuzz_n() {
        assertEquals("19", FizzBuzz.fizzBuzz(19));
    }



}