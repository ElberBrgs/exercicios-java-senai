/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.poo013;

/**
 *
 * @author aluno.den
 */
public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");
    
    private String textoEstadoCivil;

    private EstadoCivil(String textoEstadoCivil) {
        this.textoEstadoCivil = textoEstadoCivil;
    }

    public String getTextoEstadoCivil() {
        return textoEstadoCivil;
    }

    public void setTextoEstadoCivil(String textoEstadoCivil) {
        this.textoEstadoCivil = textoEstadoCivil;
    }
    
}
