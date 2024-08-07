/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo003;

/**
 *
 * @author aluno.den
 */
public class POO003 {

    public static void main(String[] args) {
        Pets petUm = new Pets("Canela",1,"Pinscher","Pequeno","Sim");
        Pets petDois = new Pets("Theo",9,"Shitzu","Pequeno","Racao");
        
        System.out.println("===Pet 1===");
        System.out.println("Nome: " + petUm.getNome());
        System.out.println("Idade: " + petUm.getIdade());
        System.out.println("Raca: " + petUm.getRaca());
        System.out.println("Porte: " + petUm.getPorte());
        System.out.println("Alimentacao: " + petUm.getAlimentacao()+"\n");
        System.out.println("===Pet 2===");
        System.out.println("Nome: " + petDois.getNome());
        System.out.println("Idade: " + petDois.getIdade());
        System.out.println("Raca: " + petDois.getRaca());
        System.out.println("Porte: " + petDois.getPorte());
        System.out.println("Alimentacao: " + petDois.getAlimentacao());
    }
}
