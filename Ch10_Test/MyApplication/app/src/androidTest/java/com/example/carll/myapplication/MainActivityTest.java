package com.example.carll.myapplication;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testHelloWorld() throws Exception {
        Activity activity = getActivity();
        TextView tv = (TextView) activity.findViewById(R.id.hello);

        assertEquals(activity.getText(R.string.hello_world), tv.getText());

    }
}
