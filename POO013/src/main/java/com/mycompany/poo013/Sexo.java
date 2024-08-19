/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.poo013;

/**
 *
 * @author aluno.den
 */
public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private String textoSexo;

    private Sexo(String textoSexo) {
        this.textoSexo = textoSexo;
    }

    public String getTextoSexo() {
        return textoSexo;
    }

    public void setTextoSexo(String textoSexo) {
        this.textoSexo = textoSexo;
    }
    
}
