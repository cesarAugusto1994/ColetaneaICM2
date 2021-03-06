package com.coletanea.coletaneaicm.coletaneaicm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 *
 */
public class Colecao {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("nome")
    @Expose
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
