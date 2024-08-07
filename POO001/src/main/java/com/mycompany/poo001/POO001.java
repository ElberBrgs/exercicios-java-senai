/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo001;

/**
 *
 * @author aluno.den
 */
public class POO001 {

    public static void main(String[] args) {
        //Instanciando um objeto.
        Clientes cliente = new Clientes("Elber",22);
        Funcionarios funcionario = new Funcionarios("Pedro","Carregador de caixa",5000,"Logistica");
        
    //Forma menos prática, melhor não utilizar.    
        //cliente.nome = "Elber";
        //cliente.idade = 22;
        //cliente.salario = 5000;
        
    //Recomendado para atualizar dados
        //cliente.setNome("Elber");
        //cliente.setIdade(22);
        //cliente.setSalario(5000);
        
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Idade do cliente: " + cliente.getIdade());
        System.out.println("Funcionario: " + funcionario.getNome());
        System.out.println("Funcao: " + funcionario.getFuncao());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor());
    }
}
