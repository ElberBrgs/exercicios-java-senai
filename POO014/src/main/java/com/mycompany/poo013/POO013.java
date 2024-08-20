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
        
        Cliente clienteUm = new Cliente("AAA", Sexo.FEMININO,EstadoCivil.CASADO , "23368756233", "654982357", "03/03/2003", 7000, 7, "Clebinho", "71965876357",
                new Endereco("Alameda rua", "39", "Terceira etapa", "46873568", "Sao Paulo", UnidadeFederativa.SAO_PAULO));
        
        PrestacaoServico prestacaoServicoUm = new PrestacaoServico("12/08/2001", "15/09/2001", "654654822", "BA587532", "24/07/2001", "29/09/2001", 5005, 2, "Mecanica Simas", "71965726847",
                 new Endereco("Rua alameda", "56", "Segunda etapa", "45238745", "Salvador", UnidadeFederativa.BAHIA));
  
        System.out.println(clienteUm.toString());
        System.out.println(prestacaoServicoUm.toString());
    }
}
