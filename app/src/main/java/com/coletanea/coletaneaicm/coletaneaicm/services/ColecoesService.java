package com.coletanea.coletaneaicm.coletaneaicm.services;

import com.coletanea.coletaneaicm.coletaneaicm.model.Colecao;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ana Maria on 10/06/2017.
 */

public interface ColecoesService {

    @GET("colecoes")
    Call<List<Colecao>> getDados();

}
