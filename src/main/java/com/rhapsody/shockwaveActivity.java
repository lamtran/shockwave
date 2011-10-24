package com.rhapsody;

import android.app.Activity;
import android.os.Bundle;

public class shockwaveActivity extends Activity {
    private static String TAG = "shockwave";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
