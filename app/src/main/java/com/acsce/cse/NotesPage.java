package com.acsce.cse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotesPage extends AppCompatActivity {
    Toolbar toolbar;
    int sem_no;
    public Button btn1, btn2,btn3,btn4,btn5,btn6,btn7, btn8, btn9,btn10,btn11,btn12,btn13,btn14, btn15, btn16,btn17,btn18,btn19,btn20,btn21, btn22, btn23,btn24,btn25, btn26,btn27,btn28, btn29, btn30,btn31,btn32,btn33,btn34,btn35,btn36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        sem_no = intent.getExtras().getInt("sem");



        switch (sem_no) {
            case 6:  sem6();
                break;
            default:  setContentView(R.layout.coming_soon);
                break;
        }
    }
    
    void sem6(){
        setContentView(R.layout.sem6_notes_page);
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
        btn15= findViewById(R.id.button15);
        btn16 = findViewById(R.id.button16);
        btn17= findViewById(R.id.button17);
        btn18 = findViewById(R.id.button18);
        btn19= findViewById(R.id.button19);
        btn20 = findViewById(R.id.button20);
        btn21= findViewById(R.id.button21);
        btn22 = findViewById(R.id.button22);
        btn23= findViewById(R.id.button23);
        btn24= findViewById(R.id.button24);
        btn25= findViewById(R.id.button25);
        btn26 = findViewById(R.id.button26);
        btn27= findViewById(R.id.button27);
        btn28 = findViewById(R.id.button28);
        btn29= findViewById(R.id.button29);
        btn30 = findViewById(R.id.button30);
        btn31= findViewById(R.id.button31);
        btn32 = findViewById(R.id.button32);
        btn33= findViewById(R.id.button33);
        btn34= findViewById(R.id.button34);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cns_mod1_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cns_mod2_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cns_mod3_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cns_mod4_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cns_mod5_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cg_mod1_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cg_mod2_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile", "cg_mod3_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cg_mod4_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cg_mod5_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "ss_mod1_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "ss_mod2_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "ss_mod3_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "ss_mod4_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "ss_mod5_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "os_mod1_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "os_mod2_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile", "os_mod3_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "os_mod4_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "os_mod5_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "dm_mod1_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "dm_mod2_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "dm_mod3_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "dm_mod4_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "dm_mod5_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "or_mod1_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "or_mod2_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile", "or_mod3_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });

        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "or_mod4_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "or_mod5_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "think_py_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "intro_py_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });


        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "os_manual_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NotesPage.this, pdf.class);
                i.putExtra("pdfFile",  "cg_manual_compressed");
                i.putExtra("sem",  "sem"+sem_no);
                i.putExtra("type",  "notes");
                startActivity(i);
            }
        });
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
