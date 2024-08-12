/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo007;

/**
 *
 * @author aluno.den
 */
public class Memoria extends Produto{
    private int capacidadeArmazenamento;

    public Memoria(int capacidadeArmazenamento, String marca, String modelo) {
        super(marca, modelo);
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }
    
}
