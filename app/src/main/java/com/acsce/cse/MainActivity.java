package com.acsce.cse;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private PreferenceManager prefManager;
    private DrawerLayout drawerlayout;
    private NavigationView nv;
    private ActionBarDrawerToggle dtoggle;
    Context context;

    int sem_no;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        drawerlayout = findViewById(R.id.drawer_layout);
        dtoggle = new ActionBarDrawerToggle(this, drawerlayout, R.string.open, R.string.close);
        drawerlayout.addDrawerListener(dtoggle);
        dtoggle.syncState();

        prefManager = new PreferenceManager(this);

        requestPermissions(new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        requestPermissions(new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE}, 1);

        ImageView drawerButton = findViewById(R.id.dbtn);
        drawerButton.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        drawerlayout.openDrawer(Gravity.LEFT);
                    }
                });

        nv = findViewById(R.id.nav_drawer);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.nav_about:
                        Intent intent1 = new Intent(MainActivity.this, About.class);
                        startActivity(intent1);
                        drawerlayout.closeDrawers();
                        break;
                    case R.id.nav_settings:
                        Intent i =new Intent(MainActivity.this, Settings.class);
                        i.putExtra("page","main");
                        startActivityForResult(i,0);
                        drawerlayout.closeDrawers();
                        break;

                    case R.id.nav_feedback:
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int height = displayMetrics.heightPixels;
                        int width = displayMetrics.widthPixels;
                        String  details =  "Android Version: "+Build.VERSION.RELEASE
                                +"\nSDK Number: "+Build.VERSION.SDK_INT
                                +"\nProcessor: "+Build.HARDWARE
                                +"\nModel: "+Build.MANUFACTURER+" "+ Build.MODEL
                                +"\nDevice Width: "+width
                                +"\nDevice Height: "+height
                                +"\n---Please don't edit anything above this line, to help serve you better---\n\n";
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("plain/text");
                        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"nannigalaxy25@gmail.com"});
                        intent.putExtra(Intent.EXTRA_SUBJECT, "CSE app feedback");
                        intent.putExtra(Intent.EXTRA_TEXT, details);
                        context.startActivity(intent);
                        break;
                    default:
                        return true;
                }


                return true;

            }
        });
        displayName();
    }


    public void card_class(View view) {

        sem_no = prefManager.getDefaultsInt(prefManager.sem_no_key,MainActivity.this);
        if (sem_no!=0 ){
                Intent intent = new Intent(MainActivity.this, Class_activity.class);
                intent.putExtra("sem", sem_no);
                startActivity(intent);
        }
        else{
            View v = findViewById(R.id.snackbarPosition);
            Utils.showSnackBar(getApplicationContext(),v,"Please choose your Semester in settings");
        }
    }

    public void card_explore(View view) {

        Intent intent = new Intent(MainActivity.this, SemesterList.class);
        startActivity(intent);

    }

    public void card_campus(View view) {

        Intent intent = new Intent(MainActivity.this, WebActivity.class);
        intent.putExtra("webContent",  "campus.uno");


        if (isConnectingToInternet()) {
            if (prefManager.getDefaults(prefManager.uni_no_key, MainActivity.this) != null) {
                if (prefManager.getDefaults(prefManager.uni_no_key, MainActivity.this).isEmpty() && prefManager.getDefaults(prefManager.passwd_key, MainActivity.this).isEmpty())
                    popup();

            else {
                Toast.makeText(getApplicationContext(), "Loading Campus.uno", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        }
            else
                popup();
        }
        else{
            NoInternet();
        }

    }
    public void card_nptel(View view) {

        Intent intent = new Intent(MainActivity.this, WebActivity.class);
        intent.putExtra("webContent",  "nptel");

        if (isConnectingToInternet()) {
            Toast.makeText(getApplicationContext(),"Loading NPTEL Swayam", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        else{
            NoInternet();
        }

    }

    public void card_vtu_res(View view) {

        Intent intent = new Intent(MainActivity.this, WebActivity.class);
        intent.putExtra("webContent",  "vtu result");

        if (isConnectingToInternet()) {
            Toast.makeText(getApplicationContext(),"Loading VTU Result page", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        else{
            NoInternet();
        }

    }


    public void displayName(){

        String name = prefManager.getDefaults(prefManager.name_key, MainActivity.this);
        String uni_val = prefManager.getDefaults(prefManager.uni_no_key, MainActivity.this);
        TextView main_title = findViewById(R.id.main_title);
        View headerView = nv.getHeaderView(0);
        TextView nav_name_text = headerView.findViewById(R.id.nav_name);
        TextView nav_uni_text = headerView.findViewById(R.id.nav_uni_no);
        try {
            if (!name.equals("")){
                String fname=name.split(" ")[0];
                if(fname.length()!=1) {
                    main_title.setText("Welcome, " + fname);
                }
                else {
                    main_title.setText("Welcome, " + name.split(" ")[name.split(" ").length-1]);
                }
                nav_name_text.setText(name);
                nav_uni_text.setText(uni_val);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void popup(){
        AlertDialog.Builder builder
                = new AlertDialog
                .Builder(MainActivity.this);

        builder.setMessage("Do you want to fill credentials?");

        builder.setTitle("Use Auto Login feature");
        builder.setCancelable(false);
        builder.setPositiveButton("Settings", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Intent i =new Intent(MainActivity.this, Settings.class);
                                startActivityForResult(i,0);
                            }
                        });

        builder.setNegativeButton("Skip",  new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                                intent.putExtra("webContent",  "campus.uno");
                                Toast.makeText(getApplicationContext(), "Loading Campus.uno", Toast.LENGTH_SHORT).show();
                                startActivity(intent);
                            }
                        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        displayName();
        super.onActivityResult(requestCode,resultCode,data);
    }


    //Check if internet is present or not
    private boolean isConnectingToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }

    void NoInternet(){
        View v = findViewById(R.id.snackbarPosition);
        Utils.showSnackBar(getApplicationContext(),v,"Please connect to Internet");
    }
}