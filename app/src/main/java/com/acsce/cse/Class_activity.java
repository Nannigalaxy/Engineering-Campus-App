package com.acsce.cse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Class_activity extends AppCompatActivity {
    TextView t;
    int sem_no;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();
        sem_no = intent.getExtras().getInt("sem");

        t = findViewById(R.id.sem_title);
        switch (sem_no){
            case 3: t.setText(R.string.sem3);
            break;
            case 4: t.setText(R.string.sem4);
                break;
            case 5: t.setText(R.string.sem5);
                break;
            case 6: t.setText(R.string.sem6);
                break;
            case 7: t.setText(R.string.sem7);
                break;
            case 8: t.setText(R.string.sem8);
                break;
        }

    }

    public void card_tt(View view) {

        switch (sem_no){
            case 3: 

            case 4:

            case 5:

            case 6:

            case 7:

            case 8:View v = findViewById(R.id.snackbarPosition);
                Utils.showSnackBar(getApplicationContext(),v,"TimeTable not yet uploaded");
                break;
        }



    }


    public void card_syllb(View view) {

        Intent intent = new Intent(Class_activity.this, SylbActivity.class);
        intent.putExtra("sem",sem_no);
        startActivity(intent);

    }



    public void card_notes(View view) {

        Intent intent = new Intent(Class_activity.this, NotesPage.class);
        intent.putExtra("sem",sem_no);
        startActivity(intent);

    }

    public void card_qp(View view) {

        Intent intent = new Intent(Class_activity.this, QpPage.class);
        intent.putExtra("sem",sem_no);
        startActivity(intent);

    }
}
