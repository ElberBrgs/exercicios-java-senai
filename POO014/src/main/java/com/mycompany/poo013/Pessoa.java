/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo013;

/**
 *
 * @author Outros
 */
public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String telefone;
    protected Endereco endereco;

    public Pessoa(int id, String nome, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n===Usuario===" +
               "\nId: " + id + 
               "\nNome: " + nome + 
               "\nTelefone: " + telefone+
                "\n---Endereco---"+endereco;
    }
    
}
