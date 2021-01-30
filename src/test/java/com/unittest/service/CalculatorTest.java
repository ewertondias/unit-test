package com.unittest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void sumTwoValues() {
        // Scenario
        int a = 5;
        int b = 3;
        Calculator calc = new Calculator();

        // Action
        int result = calc.sum(a, b);

        // Verification
        assertEquals(8, result);
    }

}
