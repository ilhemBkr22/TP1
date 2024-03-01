package org.example.TestBranchCverage;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationBranchTest {


    @Test
    public void testSolveDeltaPositive() {
        double[] result = QuadraticEquation.solve(1, -3, 2);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(2, result[0], 0.0001);
        assertEquals(1, result[1], 0.0001);
    }

    @Test
    public void testSolveDeltaZero() {
        double[] result = QuadraticEquation.solve(1, -4, 4);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(2, result[0], 0.0001);
    }

    @Test
    public void testSolveDeltaNegative() {
        double[] result = QuadraticEquation.solve(2, 1, 2);
        assertNull(result);
    }


    @Test
    void testSolveAZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 2, 3);
        });
    }}