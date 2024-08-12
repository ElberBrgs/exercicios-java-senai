/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo006;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class POO006 {

    public static void main(String[] args) {
        //Scanner cpuUm = new Scanner(System.in);
       //String marcaCpu = cpuUm.nextLine();
        
        Processadores processador = new Processadores("AMD", "Athlon 240ge", 3.5);
        Memorias memoria = new Memorias("HyperX", "Fury", 16);
        
        System.out.println("===Dados do processador===");
        System.out.println("Marca: "+processador.getMarca());
        System.out.println("Modelo: "+processador.getModelo());
        System.out.println("Frequencia: "+processador.getFrequencia());
        System.out.println("\n===Dados da memoria===");
        System.out.println("Marca: "+memoria.getMarca());
        System.out.println("Modelo: "+memoria.getModelo());
        System.out.println("Armazenamento: "+memoria.getArmazenamento());
        
    }
}
