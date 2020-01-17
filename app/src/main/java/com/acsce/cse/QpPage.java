package com.acsce.cse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qp_page);

        Toolbar toolbar = findViewById(R.id.toolbar);

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


        Button btn1 = findViewById(R.id.button1);
        Button btn2= findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4= findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6= findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8= findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);
        Button btn10= findViewById(R.id.button10);
        Button btn11 = findViewById(R.id.button11);
        Button btn12= findViewById(R.id.button12);
        Button btn13 = findViewById(R.id.button13);
        Button btn14= findViewById(R.id.button14);



        final String cs51_jul_18 = "cs51_jul_18";
        final String cs51_jan_18 = "cs51_jan_18";
        final String cs52_jul_18 = "cs52_jul_18";
        final String cs52_jan_18 = "cs52_jan_18";
        final String cs53_jul_18 = "cs53_jul_18";
        final String cs53_jan_18 = "cs53_jan_18";
        final String cs54_jul_18 = "cs54_jul_18";
        final String cs54_jan_18 = "cs54_jan_18";
        final String cs54_jul_17 = "cs54_jul_17";
        final String cs552_jan_18 = "cs552_jan_18";
        final String cs552_jul_18 = "cs552_jul_18";
        final String cs553_jan_18 = "cs553_jan_18";
        final String cs553_jul_18 = "cs553_jul_18";
        final String cs562_jul_18 = "cs562_jul_18";

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs51_jul_18);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs51_jan_18);
                startActivity(i);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs52_jul_18);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs52_jan_18);
                startActivity(i);
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs53_jul_18);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs53_jan_18);
                startActivity(i);
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs54_jul_18);
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs54_jan_18);
                startActivity(i);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs54_jul_17);
                startActivity(i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs552_jan_18);
                startActivity(i);
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs552_jul_18);
                startActivity(i);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs553_jan_18);
                startActivity(i);
            }
        });


        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs553_jul_18);
                startActivity(i);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QpPage.this, pdf.class);
                i.putExtra("pdfFile",  cs562_jul_18);
                startActivity(i);
            }
        });


    }
}
