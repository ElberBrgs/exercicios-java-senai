/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo007;

/**
 *
 * @author aluno.den
 */
public class POO007 {

    public static void main(String[] args) {
        Processador processadorUm = new Processador(3.5, "Intel", "I7");
        Memoria memoriaUm = new Memoria(5,"HyperX", "Fury");
        
        System.out.println("===Processador===");
        System.out.println("Marca: "+processadorUm.getMarca());
        System.out.println("Modelo: "+processadorUm.getModelo());
        System.out.println("Frequencia: "+processadorUm.getFrequencia());
        System.out.println("\n===Memoria===");
        System.out.println("Marca: "+memoriaUm.getMarca());
        System.out.println("Modelo: "+memoriaUm.getModelo());
        System.out.println("Armazenamento: "+memoriaUm.getCapacidadeArmazenamento());
    }
}
