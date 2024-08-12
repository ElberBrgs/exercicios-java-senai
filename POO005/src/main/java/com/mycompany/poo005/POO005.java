/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo005;

/**
 *
 * @author aluno.den
 */
public class POO005 {

    public static void main(String[] args) {
        Contas contaUm = new Contas("Nubanco", "07855-3", "5000", "Conta corrente", 500, 2000);
        //PRIMEIRA FORMA.
        Funcionarios funcionarioUm = new Funcionarios("0237", "Joao Banco", "Via Rua Alameda", "71912345678", "Joaobancao@email.com",contaUm);
        
        //SEGUNDA FORMA.
        Funcionarios funcionarioDois = new Funcionarios("2654", "Maria Banco", "Rua Alameda Via", "71998765432", "Mariabanquinha@email.com",
        new Contas("Kaicha","5483-2","7000","Conta corrente",5500,6600));
        
        System.out.println("===Funcionario 1===");
        System.out.println("Nome: "+funcionarioUm.getNome());
        System.out.println("---Dados da conta---");
        System.out.println("Banco: "+funcionarioUm.getContaBanco().getBanco());
        System.out.println("Agencia: "+funcionarioUm.getContaBanco().getAgencia());
        System.out.println("\n===Funcionario 2===");
        System.out.println("Nome: "+funcionarioDois.getNome());
        System.out.println("---Dados da conta---");
        System.out.println("Banco: "+funcionarioDois.getContaBanco().getBanco());
        System.out.println("Agencia: "+funcionarioDois.getContaBanco().getAgencia());
        
        
    }
}
