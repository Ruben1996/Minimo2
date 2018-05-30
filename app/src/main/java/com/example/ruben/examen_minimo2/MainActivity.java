package com.example.ruben.examen_minimo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {
    protected ProgressBar pb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb1 = (ProgressBar) findViewById(R.id.progressBar);
        pb1.setVisibility(ProgressBar.INVISIBLE);
    }

    public void buttonLista (View view) {

        pb1.setVisibility(ProgressBar.VISIBLE);
        Intent i = new Intent(getApplicationContext(), Lista_Libros.class);
        startActivity(i);


    }
}
