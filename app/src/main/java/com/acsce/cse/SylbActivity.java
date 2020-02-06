package com.acsce.cse;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;


public class SylbActivity extends AppCompatActivity {
    ExpandableRelativeLayout expandableLayout;
    boolean iconExpanded = true;
    Toolbar toolbar;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_syllb);
        Intent intent = getIntent();
        int sem_no = intent.getExtras().getInt("sem");

        switch (sem_no) {
            case 5: setContentView(R.layout.sem5_syllb);
            toolbar();
                break;
            case 6: setContentView(R.layout.sem6_syllb);
            toolbar();
                break;
            default: notuploaded();
                break;
        }


//        final String csl57_man = "csl57_man";
//        final String csl58_man = "csl58_man";
//
//        Button btn8 = findViewById(R.id.btn8);
//        Button btn9 = findViewById(R.id.btn9);


//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //add pdf viewer directly for lab manual
//                Intent i = new Intent(SylbActivity.this, pdf.class);
//                i.putExtra("pdfFile",  csl57_man);
//                startActivity(i);
//            }
//        });
//        btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(SylbActivity.this, pdf.class);
//                i.putExtra("pdfFile",  csl58_man);
//                startActivity(i);
//            }
//        });


    }

    //buttons
    public void button1 (View view) {
        expandableLayout = findViewById(R.id.content1);
        expandableLayout.toggle(); // toggle expand and collapse
        ImageView arrow_icon= findViewById(R.id.arrow1);

        if (iconExpanded){
            arrow_icon.animate().setDuration(300).rotation(180).start();
            iconExpanded = false;
        }
        else{
            arrow_icon.animate().setDuration(300).rotation(0).start();
            iconExpanded = true  ;
        }

    }

    public void button2 (View view) {
        expandableLayout = findViewById(R.id.content2);
        expandableLayout.toggle(); // toggle expand and collapse
        ImageView arrow_icon= findViewById(R.id.arrow2);

        if (iconExpanded){
            arrow_icon.animate().setDuration(300).rotation(180).start();
            iconExpanded = false;
        }
        else{
            arrow_icon.animate().setDuration(300).rotation(0).start();
            iconExpanded = true  ;
        }

    }
    public void button3 (View view) {
        expandableLayout = findViewById(R.id.content3);
        expandableLayout.toggle(); // toggle expand and collapse
        ImageView arrow_icon= findViewById(R.id.arrow3);

        if (iconExpanded){
            arrow_icon.animate().setDuration(300).rotation(180).start();
            iconExpanded = false;
        }
        else{
            arrow_icon.animate().setDuration(300).rotation(0).start();
            iconExpanded = true  ;
        }

    }

    public void button4 (View view) {
        expandableLayout = findViewById(R.id.content4);
        expandableLayout.toggle(); // toggle expand and collapse
        ImageView arrow_icon= findViewById(R.id.arrow4);

        if (iconExpanded){
            arrow_icon.animate().setDuration(300).rotation(180).start();
            iconExpanded = false;
        }
        else{
            arrow_icon.animate().setDuration(300).rotation(0).start();
            iconExpanded = true  ;
        }

    }

    public void button5 (View view) {
        expandableLayout = findViewById(R.id.content5);
        expandableLayout.toggle(); // toggle expand and collapse
        ImageView arrow_icon= findViewById(R.id.arrow5);

        if (iconExpanded){
            arrow_icon.animate().setDuration(300).rotation(180).start();
            iconExpanded = false;
        }
        else{
            arrow_icon.animate().setDuration(300).rotation(0).start();
            iconExpanded = true  ;
        }

    }

    public void button6 (View view) {
        expandableLayout = findViewById(R.id.content6);
        expandableLayout.toggle(); // toggle expand and collapse
        ImageView arrow_icon= findViewById(R.id.arrow6);

        if (iconExpanded){
            arrow_icon.animate().setDuration(300).rotation(180).start();
            iconExpanded = false;
        }
        else{
            arrow_icon.animate().setDuration(300).rotation(0).start();
            iconExpanded = true  ;
        }

    }

    public void button7 (View view) {
        expandableLayout = findViewById(R.id.content7);
        expandableLayout.toggle(); // toggle expand and collapse
        ImageView arrow_icon= findViewById(R.id.arrow7);

        if (iconExpanded){
            arrow_icon.animate().setDuration(300).rotation(180).start();
            iconExpanded = false;
        }
        else{
            arrow_icon.animate().setDuration(300).rotation(0).start();
            iconExpanded = true  ;
        }

    }
    public void button8 (View view) {
        expandableLayout = findViewById(R.id.content8);
        expandableLayout.toggle(); // toggle expand and collapse
        ImageView arrow_icon= findViewById(R.id.arrow8);

        if (iconExpanded){
            arrow_icon.animate().setDuration(300).rotation(180).start();
            iconExpanded = false;
        }
        else{
            arrow_icon.animate().setDuration(300).rotation(0).start();
            iconExpanded = true  ;
        }

    }
    public void button9 (View view) {
        expandableLayout = findViewById(R.id.content9);
        expandableLayout.toggle(); // toggle expand and collapse
        ImageView arrow_icon= findViewById(R.id.arrow9);

        if (iconExpanded){
            arrow_icon.animate().setDuration(300).rotation(180).start();
            iconExpanded = false;
        }
        else{
            arrow_icon.animate().setDuration(300).rotation(0).start();
            iconExpanded = true  ;
        }

    }

    void toolbar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    void notuploaded(){
        setContentView(R.layout.coming_soon);
    }
}



