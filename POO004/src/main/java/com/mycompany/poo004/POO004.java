/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo004;

public class POO004 {

    public static void main(String[] args) {
        Veiculos veiculo = new Veiculos("BAH1988","Azul",5,100,200,9);
        Clientes cliente = new Clientes("Joaozinho",59,"12345678910","Via Rua Avenida Alameda","71912345678");
        
        
        System.out.println("===Veiculo===");
        System.out.println("Placa: "+veiculo.getPlaca());
        System.out.println("Cor: "+veiculo.getCor());
        System.out.println("Numero de passageiros: "+veiculo.getNumeroPassageiros());
        System.out.println("Capacidade de tanque: "+veiculo.getCapacidadeTanque());
        System.out.println("Velocidade maxima: "+veiculo.getVelocidadeMaxima());
        System.out.println("Consumo medio: "+veiculo.getConsumoMedio());
        
        System.out.println("\n===Cliente===");
        System.out.println("Nome: "+cliente.getNome());
        System.out.println("Idade: "+cliente.getIdade());
        System.out.println("Cpf: "+cliente.getCpf());
        System.out.println("Endereco: "+cliente.getEndereco());
        System.out.println("Telefone: "+cliente.getTelefone());
    }
}
