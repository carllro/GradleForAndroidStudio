package com.example.carll.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicTest {

    private Logic logic;

    @Before
    public void setUp() throws Exception {
        logic = new Logic();
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals("2 + 2 = 4", 4, logic.add(2, 2));
        assertEquals("4 + 3 = 7", 7, logic.add(4, 3));
    }

    @Test
    public void testSubtract() throws Exception {
        Logic logic = new Logic();
        assertEquals("2 - 2 = 0", 0, logic.subtract(2, 2));
        assertEquals("4 - 3 = 1", 1, logic.subtract(4, 3));
    }
}