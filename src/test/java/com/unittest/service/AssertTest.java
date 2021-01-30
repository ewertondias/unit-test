package com.unittest.service;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AssertTest {

    @Test
    void test() {
        // AssertTrue AssertFalse
        assertTrue(true);
        assertFalse(false);
        assertTrue("first".equalsIgnoreCase("First"));
        assertTrue("first".startsWith("fi"));

        // AssertEquals AssertNotEquals
        assertEquals(1, 1);
        assertEquals(0.51234, 0.512, 0.001);
        assertEquals(Math.PI, 3.14, 0.01);

        int i = 5;
        Integer i2 = 5;
        assertEquals(i, i2);
        assertEquals(Integer.valueOf(i), i2);
        assertEquals(i, i2.intValue());

        String name = null;
        String firstName = "Ewerton";

        assertEquals("first", "first");

        // Com mensagem caso de erro
        assertEquals("first", "first", "Erro ao comparar");
        assertNotEquals("first", "second");


        // AssertNull AssertNotNull
        assertNull(name);
        assertNotNull(firstName);

        // AssertThat
        assertThat(5.0, is(equalTo(5.0)));
        assertThat(5.0, is(not(6.0)));
    }

}
