package com.acsce.cse;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;
import java.io.File;




public class pdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);


        Intent intent = getIntent();
        String pdf_file = intent.getExtras().getString("pdfFile");

        final Context context = this;
        Utils u = new Utils();
        String baseDir = Environment.getExternalStorageDirectory().getAbsolutePath();

        File pdfFile = new File(Environment.getExternalStorageDirectory(),"/CSE/"+pdf_file+".pdf");//File path


        if (pdfFile.exists()) //Checking if the file exists or not
        {
            Uri path = FileProvider.getUriForFile(context,  baseDir, pdfFile);
            context.grantUriPermission(context.getPackageName(), path, Intent.FLAG_GRANT_READ_URI_PERMISSION);
            Intent objIntent = new Intent(Intent.ACTION_VIEW);
            objIntent.setDataAndType(path, "application/pdf");
            objIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            context.startActivity(objIntent);

        } else {

            String pdfUrl = "http://ngxapplications.c1.biz/storage/android/cse/5th/qp/"+pdf_file+".pdf";

            Toast.makeText(getApplicationContext(), "Downloading", Toast.LENGTH_SHORT).show();

            if (isConnectingToInternet()){
                new DownloadTask(pdf.this, pdfUrl);
                Toast.makeText(getApplicationContext(), "Download Complete", Toast.LENGTH_SHORT).show();
                }
            else
                Toast.makeText(pdf.this, "This file is not downloaded. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();


            Uri path = FileProvider.getUriForFile(context,  baseDir, pdfFile);
            context.grantUriPermission(context.getPackageName(), path, Intent.FLAG_GRANT_READ_URI_PERMISSION);
            Intent objIntent = new Intent(Intent.ACTION_VIEW);
            objIntent.setDataAndType(path, "application/pdf");
            objIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            context.startActivity(objIntent);

        }

        finish();

    }
    //Check if internet is present or not
    private boolean isConnectingToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }


}
