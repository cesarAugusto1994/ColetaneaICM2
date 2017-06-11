package com.coletanea.coletaneaicm.coletaneaicm.connection;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.coletanea.coletaneaicm.coletaneaicm.HomeActivity;
import com.coletanea.coletaneaicm.coletaneaicm.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Ana Maria on 10/06/2017.
 */

public class DownloadDados extends AsyncTask {

    private static final String TAG = "Http Connection";
    private ListView listAct = null;
    private ArrayAdapter arrayAdapter = null;

    @Override
    protected Object doInBackground(Object[] params) {

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        try {
            URL url = new URL("http://pokeapi.co/api/v2/pokemon/1/");
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();

            reader = new BufferedReader(new InputStreamReader(inputStream));

            String linha;
            StringBuffer buffer = new StringBuffer();
            while((linha = reader.readLine()) != null) {
                buffer.append(linha);
                buffer.append("\n");
            }

            return buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            if (urlConnection != null) {
                urlConnection.disconnect();
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        return null;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

}
