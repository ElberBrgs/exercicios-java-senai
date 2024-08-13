/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo009;

/**
 *
 * @author aluno.den
 */
public class POO009 {

    public static void main(String[] args) {
        Funcionarios funcionarioUm = new Funcionarios("007", "James Bond", 7000, Setor.RECURSOS_HUMANOS, Sexo.MASCULINO, 45);
        Funcionarios funcionarioDois = new Funcionarios("555", "Maria Joao", 10000, Setor.MARKETING, Sexo.FEMININO, 30);
        
        System.out.println("===Funcionario 1===");
        System.out.println("Id: "+funcionarioUm.getId());
        System.out.println("Nome: "+funcionarioUm.getNome());
        System.out.println("Salario: "+funcionarioUm.getSalario());
        System.out.println("Setor: "+funcionarioUm.getSetor());
        System.out.println("Sexo: "+funcionarioUm.getSexo());
        System.out.println("Idade: "+funcionarioUm.getIdade());
        System.out.println("\n===Funcionario 2===");
        System.out.println("Id: "+funcionarioDois.getId());
        System.out.println("Nome: "+funcionarioDois.getNome());
        System.out.println("Salario: "+funcionarioDois.getSalario());
        System.out.println("Setor: "+funcionarioDois.getSetor());
        System.out.println("Sexo: "+funcionarioDois.getSexo());
        System.out.println("Idade: "+funcionarioDois.getIdade());
    }
}
