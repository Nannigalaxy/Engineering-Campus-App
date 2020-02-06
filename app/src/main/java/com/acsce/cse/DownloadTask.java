package com.acsce.cse;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


    public class DownloadTask {

        private static final String TAG = "Download Task";
        private Context context;
        boolean opfile;
        private String downloadUrl = "", downloadFileName = "", filename = "";

        public DownloadTask(Context context, String downloadUrl, String filename) {
            this.context = context;
            this.downloadUrl = downloadUrl;
            this.filename = filename;

            downloadFileName = filename;//Create file name by picking download file name from URL
            Log.e(TAG, downloadFileName);

            //Start Downloading Task
            new DownloadingTask().execute();
        }

        private class DownloadingTask extends AsyncTask<Void, Void, Boolean> {

            File apkStorage = null;
            File outputFile = null;

            @Override
            protected Boolean doInBackground(Void... arg0) {

                try {
                    URL url = new URL(downloadUrl);//Create Download URl
                    HttpURLConnection c = (HttpURLConnection) url.openConnection();//Open Url Connection
                    c.setRequestMethod("GET");//Set Request Method to "GET" since we are grtting data
                    c.connect();//connect the URL Connection

                    //If Connection response is not OK then show Logs
                    if (c.getResponseCode() != HttpURLConnection.HTTP_OK) {
                        Log.e(TAG, "Server returned HTTP " + c.getResponseCode()
                                + " " + c.getResponseMessage());
                    }

                    //Get File if SD card is present
                    if (new CheckForSDCard().isSDCardPresent()) {

                        apkStorage = new File(
                                Environment.getExternalStorageDirectory() + "/"
                                        + Utils.downloadDirectory);
                    } else
                        Toast.makeText(context, "Oops!! There is no SD Card.", Toast.LENGTH_SHORT).show();

                    //If File is not present create directory
                    if (!apkStorage.exists()) {
                        boolean s = apkStorage.mkdir();
                        Log.e(TAG, apkStorage.toString());
                    }

                    outputFile = new File(apkStorage, downloadFileName);//Create Output file in Main File

                    //Create New File if not present
                    if (!outputFile.exists() && apkStorage.exists()) {
                        try {
                            opfile = outputFile.createNewFile();
                            Log.e(TAG, "File Created");
                        }
                        catch (Exception e){
                            Log.e(TAG, e.toString());
                        }
                    }

                    FileOutputStream fos = new FileOutputStream(outputFile);//Get OutputStream for NewFile Location

                    InputStream is = c.getInputStream();//Get InputStream for connection

                    byte[] buffer = new byte[1024];//Set buffer type
                    int len1 = 0;//init length
                    while ((len1 = is.read(buffer)) != -1) {
                        fos.write(buffer, 0, len1);//Write new file
                    }

                    //Close all connection after doing task
                    fos.close();
                    is.close();

                } catch (Exception e) {

                    //Read exception if something went wrong
                    e.printStackTrace();
                    outputFile = null;
                    Log.e(TAG, "Download Error Exception " + e.getMessage());
                }

                return opfile;
            }

            @Override
            protected void onPostExecute(Boolean result) {
                Toast.makeText(context, "Download Complete", Toast.LENGTH_SHORT).show();
                super.onPostExecute(result);
            }
        }
    }