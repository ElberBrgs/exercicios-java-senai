/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.poo016;

/**
 *
 * @author aluno.den
 */
public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operacoes");
    
    private String textoSetor;

    private Setor(String textoSetor) {
        this.textoSetor = textoSetor;
    }

    public String getTextoSetor() {
        return textoSetor;
    }

    
}
