package com.example.dhwani_android.customview.activities;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dhwani_android.customview.R;
import com.example.dhwani_android.customview.views.ShapeSelectorView;

/**
 * Created by DHWANI-ANDROID on 08-05-17.
 */

public class ShapeDemoActivity extends Activity {
    private Button btnSelect;
    private ShapeSelectorView shapeSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_demo);
        shapeSelector = (ShapeSelectorView) findViewById(R.id.shapeSelector);
        btnSelect = (Button) findViewById(R.id.btnSelect);
        btnSelect.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(ShapeDemoActivity.this, "You selected: " +
                        shapeSelector.getSelectedShape(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.shape_demo, menu);
        return true;
    }


}