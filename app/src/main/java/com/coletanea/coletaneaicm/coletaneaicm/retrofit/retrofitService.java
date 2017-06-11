package com.coletanea.coletaneaicm.coletaneaicm.retrofit;

import com.coletanea.coletaneaicm.coletaneaicm.services.ColecoesService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;



public class retrofitService {

    private final Retrofit retrofit;

    public retrofitService() {

        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("https://coletaneaicm.com/api/");
        builder.addConverterFactory(JacksonConverterFactory.create());
        retrofit = builder.build();

    }

    public ColecoesService getColecoes() {
        return retrofit.create(ColecoesService.class);
    }
}
