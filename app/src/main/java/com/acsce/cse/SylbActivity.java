package com.acsce.cse;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class SylbActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_syllb);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        //Your toolbar is now an action bar and you can use it like you always do, for example:

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });




        final String csl57_man = "csl57_man";
        final String csl58_man = "csl58_man";

        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add pdf viewer directly for lab manual
                Intent i = new Intent(SylbActivity.this, pdf.class);
                i.putExtra("pdfFile",  csl57_man);
                startActivity(i);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SylbActivity.this, pdf.class);
                i.putExtra("pdfFile",  csl58_man);
                startActivity(i);
            }
        });
    }
}



