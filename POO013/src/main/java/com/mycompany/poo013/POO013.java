/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo013;

/**
 *
 * @author Outros
 */
public class POO013 {

    public static void main(String[] args) {
        
        Fisica pessoaFisicaUm = new Fisica(Sexo.FEMININO, "63847512366", "687394123", "02/02/2002", 5000, 5, "Joana", "71996751357", 
                new Endereco("Via Rua", "172", "5454", "65489213", "Salvador", UnidadeFederativa.BAHIA));
        
        Juridica pessoaJuridicaUm = new Juridica("45", "654AS", "27/02/2020", "28/03/2021", 20000, 17, "CarraraTaxi", "71996547892", 
                new Endereco("Rua alameda", "35", "segunda etapa", "35687543", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println(pessoaFisicaUm.toString());
        System.out.println(pessoaJuridicaUm.toString());
    }
}
