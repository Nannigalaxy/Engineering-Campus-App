package com.acsce.cse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        AssetManager assetManager = getAssets();
        ImageView imageView1 = findViewById(R.id.cs_logo);

        try {
            InputStream ims1 = assetManager.open("cse.png");
            Drawable d1 = Drawable.createFromStream(ims1, null);
            imageView1.setImageDrawable(d1);
        } catch (IOException ex) {
            return;
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(splashscreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 1000);

    }
}
