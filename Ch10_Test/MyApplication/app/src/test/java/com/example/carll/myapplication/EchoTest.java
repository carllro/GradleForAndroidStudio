package com.example.carll.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class EchoTest {

    @Test
    public void testEcho() throws Exception {
        assertEquals("hello", Echo.echo("hello"));
    }

    @Test
    public void testEchoLogging() throws Exception {
        assertEquals("hello", Echo.echo("hello", true));
    }
}