/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo016;

/**
 *
 * @author aluno.den
 */
public class POO016 {

    public static void main(String[] args) {
        //MEXER NOS TO STRINGS MAIS TARDE
        Motoboy motoboyUm = new Motoboy("62412asd", "Jose Moto", "26/08/1994", Sexo.MASCULINO, Setor.OPERACOES, 2000);
        Diretor diretorUm = new Diretor("Joao Direcao", "29/03/2001", Sexo.MASCULINO, Setor.FINANCEIRO, 5000);
        
        System.out.println(motoboyUm.toString());
        System.out.println(diretorUm.toString());
        
        diretorUm.demitir(motoboyUm);
    }
}
