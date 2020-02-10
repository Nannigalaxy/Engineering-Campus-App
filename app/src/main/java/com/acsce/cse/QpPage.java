package com.acsce.cse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QpPage extends AppCompatActivity {

    Button btn1,btn2 ,btn3 ,btn4 ,btn5 ,btn6 ,btn7 ,btn8 ,btn9 ,btn10 ,btn11 ,btn12 ,btn13 ,btn14;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        int sem_no = intent.getExtras().getInt("sem");

        switch (sem_no) {
            case 5: sem5();
            break;
            default: notuploaded();
            break;
        }


    }

    void sem5() {
        setContentView(R.layout.sem5_qp_page);
        toolbar();

        btn1 = findViewById(R.id.button1);
        btn2= findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4= findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6= findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8= findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn10= findViewById(R.id.button10);
        btn11 = findViewById(R.id.button11);
        btn12= findViewById(R.id.button12);
        btn13 = findViewById(R.id.button13);
        btn14= findViewById(R.id.button14);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs51_jul_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs51_jan_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs52_jul_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs52_jan_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs53_jul_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs53_jan_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs54_jul_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile", "cs54_jan_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs54_jul_17");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs552_jan_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs552_jul_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs553_jan_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });


        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs553_jul_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, PDFViewer.class);
                i.putExtra("pdfFile",  "cs562_jul_18");
                i.putExtra("sem",  "sem5");
                i.putExtra("type",  "qp");
                startActivity(i);
            }
        });
    }

    void notuploaded(){
        setContentView(R.layout.coming_soon);
    }

    void toolbar(){
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        //Your toolbar is now an action bar and you can use it like you always do

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
