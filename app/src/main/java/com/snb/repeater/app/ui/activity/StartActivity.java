package com.snb.repeater.app.ui.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.snb.repeater.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_start);

        //ImageView imagelogo = (ImageView) findViewById(R.id.imagelogo);
        //imagelogo.setImageDrawable(Drawable.createFromPath());

    }
}