/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo011;

/**
 *
 * @author aluno.den
 */
public class POO011 {

    public static void main(String[] args) {
        Fisica pessoaFisicaUm = new Fisica("78945632104", "657123687", "09/11/2001", "Celso", "71945789713");
        Juridica pessoaJuridicaUm = new Juridica("00.111.222/0001-00", "6547893215", "Abravanel", "7198635471");
        
        System.out.println(pessoaFisicaUm);
        System.out.println(pessoaJuridicaUm);
    }
}
