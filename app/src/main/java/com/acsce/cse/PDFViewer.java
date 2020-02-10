package com.acsce.cse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.widget.Toast;
import java.io.File;

public class PDFViewer extends AppCompatActivity {

    public String baseDir;
    public File pdfFile;
    public String pdf_file;
    public Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        Intent intent = getIntent();
        pdf_file = intent.getExtras().getString("pdfFile");
        String sem = intent.getExtras().getString("sem");
        String type = intent.getExtras().getString("type");

        context = this;
        baseDir = Environment.getExternalStorageDirectory().getAbsolutePath();
        pdfFile = new File(Environment.getExternalStorageDirectory(),"/CSE/"+pdf_file+".pdf");//File path

        if (pdfFile.exists() && pdfFile.length()!=0) //Checking if the file exists or not
        {
            openfile();

        } else {

            String pdfUrl = Utils.mainUrl+sem+"/"+type+"/"+pdf_file+".pdf";

            if (isConnectingToInternet()){
                Toast.makeText(getApplicationContext(), "Downloading", Toast.LENGTH_SHORT).show();
                new DownloadTask(PDFViewer.this, pdfUrl,pdf_file+".pdf");

                }
            else {
                Toast.makeText(getApplicationContext(), "This file is not downloaded. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
            }

            if(pdfFile.exists() && pdfFile.length()!=0) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        openfile();

                    }
                }, 1000);
            }
        }
        finish();
    }
    //Check if internet is present or not
    private boolean isConnectingToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }

    //open pdf file externally
    public void openfile(){

        pdfFile = new File(Environment.getExternalStorageDirectory(),"/CSE/"+pdf_file+".pdf");//File path
        Uri path = FileProvider.getUriForFile(context, baseDir, pdfFile);
        context.grantUriPermission(context.getPackageName(), path, Intent.FLAG_GRANT_READ_URI_PERMISSION);
        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setDataAndType(path, "application/pdf");
        objIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        context.startActivity(objIntent);
    }


}
