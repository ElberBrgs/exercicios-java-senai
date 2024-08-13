/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo010;

/**
 *
 * @author aluno.den
 */
public class POO010 {

    public static void main(String[] args) {
        Endereco enderecoUm = new Endereco("Via", "212", "Rua Alameda", "12365478", "Salvador", UnidadeFederativa.BAHIA);
        Pessoa pessoaUm = new Pessoa(005, "Joaozinho",218,"71912345678","joazin@email.com",Sexo.MASCULINO,enderecoUm);
        
        System.out.println("==Dados de usuário===");
        System.out.println("Id: "+pessoaUm.getId());
        System.out.println("Nome: "+pessoaUm.getNome());
        System.out.println("Idade: "+pessoaUm.getIdade());
        System.out.println("E-mail: "+pessoaUm.getEmail());
        System.out.println("Sexo: "+pessoaUm.getSexo().getTextoSexo());
        
        System.out.println("\n---Endereco---");
        System.out.println("Logradouro: "+pessoaUm.getEndereco().getLogradouro());
        System.out.println("Numero: "+pessoaUm.getEndereco().getNumero());
        System.out.println("Complemento: "+pessoaUm.getEndereco().getComplemento());
        System.out.println("CEP: "+pessoaUm.getEndereco().getCep());
        System.out.println("Cidade: "+pessoaUm.getEndereco().getCidade());
        System.out.println("Unidade Federativa: "+pessoaUm.getEndereco().getUf());
        
    }
}
