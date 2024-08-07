/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo002;

/**
 *
 * @author aluno.den
 */
public class POO002 {

    public static void main(String[] args) {
        Livros livroUm = new Livros("O Messias de Duna","Frank Herbert",304,69.96);
        Livros livroDois = new Livros("O Alquimista","Paulo Coelho",208,36.84);
        
        System.out.println("===Livro 1===");
        
        System.out.println("Titulo: " + livroUm.getTitulo());
        System.out.println("Autor: " + livroUm.getAutor());
        System.out.println("Numero de paginas: " + livroUm.getPaginas());
        System.out.println("Preco: " + livroUm.getPreco() + "\n");
        
        System.out.println("===Livro 2===");
        System.out.println("Titulo: " + livroDois.getTitulo());
        System.out.println("Autor: " + livroDois.getAutor());
        System.out.println("Numero de paginas: " + livroDois.getPaginas());
        System.out.println("Preco: " + livroDois.getPreco());
        
    }
}
