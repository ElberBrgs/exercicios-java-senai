/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.poo013;

/**
 *
 * @author Outros
 */
public enum UnidadeFederativa {
    BAHIA("Bahia","BA"),
    SAO_PAULO("Sao Paulo","SP"),
    RIO_DE_JANEIRO("Rio de Janeiro","RJ");

    private String textoUnidadeFederativa;
    private String siglas;

    private UnidadeFederativa(String textoUnidadeFederativa, String siglas) {
        this.textoUnidadeFederativa = textoUnidadeFederativa;
        this.siglas = siglas;
    }

    public String getTextoUnidadeFederativa() {
        return textoUnidadeFederativa;
    }

    public String getSiglas() {
        return siglas;
    }
   
}
