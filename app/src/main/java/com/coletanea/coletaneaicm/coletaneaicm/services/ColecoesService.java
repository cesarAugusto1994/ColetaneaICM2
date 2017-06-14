package com.coletanea.coletaneaicm.coletaneaicm.services;

import com.coletanea.coletaneaicm.coletaneaicm.model.Colecao;
import com.coletanea.coletaneaicm.coletaneaicm.model.ColecoesList;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.ArrayList;
import java.util.List;

public interface ColecoesService {

    @GET("colecoes")
    Call<ColecoesList> getDados();

}
