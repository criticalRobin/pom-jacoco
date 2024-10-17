package com.test.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {
    private final ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    @Test
    void testAdd() {
        assertEquals(5, arithmeticOperations.add(2, 3));
        assertEquals(-1, arithmeticOperations.add(2, -3));
        assertEquals(0, arithmeticOperations.add(0, 0));
    }

    @Test
    void testDivide() {
        assertEquals(2, arithmeticOperations.divide(6, 3));
        assertEquals(-2, arithmeticOperations.divide(6, -3));
        assertThrows(IllegalArgumentException.class, () -> arithmeticOperations.divide(1, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(6, arithmeticOperations.multiply(2, 3));
        assertEquals(-6, arithmeticOperations.multiply(2, -3));
        assertEquals(0, arithmeticOperations.multiply(2, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(1, arithmeticOperations.subtract(3, 2));
        assertEquals(5, arithmeticOperations.subtract(2, -3));
        assertEquals(0, arithmeticOperations.subtract(0, 0));
    }
}
