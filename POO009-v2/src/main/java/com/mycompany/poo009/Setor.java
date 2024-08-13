/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.poo009;

/**
 *
 * @author aluno.den
 */
public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");
    
    private String textoSetor;

    private Setor(String textoSetor) {
        this.textoSetor = textoSetor;
    }

    public String getTextoSetor() {
        return textoSetor;
    }
    
}
