package com.example.ruben.examen_minimo2;

import com.squareup.okhttp.Response;

import java.util.List;
import java.util.Queue;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIInterface {

    @GET("/books")
    Call<List<Libro>> consultarLibros();

    @GET("/books/{id}")
    Call<Libro> consultarLibro(@Path("id")String id);



    /*
    @GET("json/consultarAlumo/{id}")
    Call<Alumno> consultarAlumno(@Path("id") String nombre);

    @GET("json/listarInstitutos")
    Call<List<Instituto>> getInstiAll();

    @GET("json/procesarOperacion")
    Call<Integer> procesarOperacion();

    @POST("json/realizarOperacion/{user}")
    Call<Response> realizarOperacion (@Path("user") String user, @Body Queue<Expressio> llistaExpressions);
*/



}
