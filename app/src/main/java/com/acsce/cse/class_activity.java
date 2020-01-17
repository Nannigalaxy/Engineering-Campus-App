package com.acsce.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class class_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_activity);
    }


    public void card_syllb(View view) {

        Intent intent = new Intent(class_activity.this, SylbActivity.class);
        startActivity(intent);

    }



    public void card_notes(View view) {

        Intent intent = new Intent(class_activity.this, NotesPage.class);
        startActivity(intent);

    }

    public void card_qp(View view) {

        Intent intent = new Intent(class_activity.this, QpPage.class);
        startActivity(intent);

    }
}
