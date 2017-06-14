package com.coletanea.coletaneaicm.coletaneaicm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Ana Maria on 13/06/2017.
 */

public class ColecoesList {

    @SerializedName("colecoes")
    @Expose
    private ArrayList<Colecao> colecoes = new ArrayList<>();

    public ArrayList<Colecao> getColecoes() {
        return colecoes;
    }

    public void setColecoes(ArrayList<Colecao> colecoes) {
        this.colecoes = colecoes;    }

}
