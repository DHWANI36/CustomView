package com.example.dhwani_android.customview.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.dhwani_android.customview.R;

/**
 * Created by DHWANI-ANDROID on 08-05-17.
 */

public class DrawingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawing, menu);
        return true;
    }

}
