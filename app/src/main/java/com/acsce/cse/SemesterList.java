package com.acsce.cse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SemesterList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semlist);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button sem3 = findViewById(R.id.thirdsem);
        Button sem4 = findViewById(R.id.fourthsem);
        Button sem5 = findViewById(R.id.fifthsem);
        Button sem6 = findViewById(R.id.sixthsem);
        Button sem7 = findViewById(R.id.seventhsem);
        Button sem8 = findViewById(R.id.eigthsem);

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SemesterList.this, Class_activity.class);
                i.putExtra("sem",3);
                startActivity(i);
            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SemesterList.this, Class_activity.class);
                i.putExtra("sem",4);
                startActivity(i);
            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SemesterList.this, Class_activity.class);
                i.putExtra("sem",5);
                startActivity(i);
            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SemesterList.this, Class_activity.class);
                i.putExtra("sem",6);
                startActivity(i);
            }
        });
        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SemesterList.this, Class_activity.class);
                i.putExtra("sem",7);
                startActivity(i);
            }
        });
        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SemesterList.this, Class_activity.class);
                i.putExtra("sem",8);
                startActivity(i);
            }
        });
    }
}

