package com.example.ruben.examen_minimo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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

public class Lista_Libros extends AppCompatActivity {

    public static final String BASE_URL = "http://api.dsamola.tk";

    private APIInterface trackServices;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        trackServices = retrofit.create(APIInterface.class);

        trackServices.consultarLibros().enqueue(new Callback<List<Libro>>() {

            @Override
            public void onResponse(Call<List<Libro>> call, Response<List<Libro>> response) {
                if (response.isSuccessful()){
                    List<Libro> List = response.body();
                    ListView lv = (ListView) findViewById(R.id.list_libros);
                    LibroArrayAdapter uaa = new LibroArrayAdapter(getApplicationContext(), List);
                    lv.setAdapter(uaa);
                }
            }

            @Override
            public void onFailure(Call<List<Libro>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "No connection", Toast.LENGTH_LONG).show();
            }
        });
/*
        @Override
        public void onItemClick(AdapterView<?>adapter,View v, int position){
            Intent intent = new Intent(Lista_Libros.this,Info_Libro.class);

            startActivity(intent);
        }

    });
 */
    }
}
