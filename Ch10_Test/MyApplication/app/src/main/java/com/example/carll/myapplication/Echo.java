package com.example.carll.myapplication;

import android.util.Log;

public class Echo {
    public static String echo(String letter) {
        return echo(letter, false);
    }

    public static String echo(String letter, boolean log) {
        if (log) {
            Log.i(Echo.class.getName(), letter);
        }
        return letter;
    }
}
