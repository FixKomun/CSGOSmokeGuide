package com.fixkomun.CSGOSmokeGuide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import pl.droidsonroids.gif.GifImageView;


public class FinalActivity extends AppCompatActivity {

    SmokeHolder smoke;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getIncomingIntent();

    }

    private void getIncomingIntent() {

        if (getIntent().hasExtra("smoke")) {
            smoke = (SmokeHolder) getIntent().getExtras().getSerializable("smoke");


            TextView name = findViewById(R.id.descriptiontv);
            name.setText(smoke.getName());

            GifImageView gifImageView = (GifImageView) findViewById(R.id.gif);
            Glide.with(this).load(smoke.getGifURL()).into(gifImageView);
        }
    }
}