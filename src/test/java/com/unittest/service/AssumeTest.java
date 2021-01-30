package com.unittest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumeTest {

    @Test
    void assumeTrue() {
        boolean saturday = true;

        // Assume que condicao e true para poder executar teste
        Assumptions.assumeTrue(saturday);

        Calculator calc = new Calculator();
        int result = calc.sum(5, 5);

        Assertions.assertEquals(10, result);
    }

}
