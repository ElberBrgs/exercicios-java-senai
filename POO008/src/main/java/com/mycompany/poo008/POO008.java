/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo008;

/**
 *
 * @author aluno.den
 */
public class POO008 {

    public static void main(String[] args) {
        Clientes clienteUm = new Clientes("Maria",Sexo.FEMININO);
        Clientes clienteDois = new Clientes("Joao", Sexo.MASCULINO);
        
        System.out.println("Nome: "+clienteUm.getNome());
        System.out.println("Sexo: "+clienteUm.getSexo());
        
        System.out.println("\nNome: "+clienteDois.getNome());
        System.out.println("Sexo: "+clienteDois.getSexo());
    }
}
