package com.example.carll.myapplication;

import android.test.AndroidTestCase;

public class EchoAndroidTest extends AndroidTestCase {
    public void testEcho() throws Exception {
        assertEquals("hello", Echo.echo("hello"));
    }

    public void testEchoLogging() throws Exception {
        assertEquals("hello", Echo.echo("hello", true));
    }
}
