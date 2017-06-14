package com.coletanea.coletaneaicm.coletaneaicm.retrofit;

import com.coletanea.coletaneaicm.coletaneaicm.services.ColecoesService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;



public class retrofitClient {

    private final Retrofit retrofitInstance;

    private static final String URL_BASE = "https://coletaneaicm.com/api/";

    public retrofitClient() {

        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(URL_BASE);
        builder.addConverterFactory(GsonConverterFactory.create());
        retrofitInstance = builder.build();

    }

    public ColecoesService getColecoes() {
        return retrofitInstance.create(ColecoesService.class);
    }
}
