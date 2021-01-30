package com.unittest.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class OrderTest {

    private static int cont = 0;

    @Test
    void init() {
        cont = 1;
    }

    @Test
    void verify() {
        assertEquals(1, cont);
    }

}
