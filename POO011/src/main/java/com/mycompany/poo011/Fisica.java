/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo011;

/**
 *
 * @author aluno.den
 */
public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica(String cpf, String rg, String dataNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "\n===Pessoa Fisica===" +
                "\nNome: "+super.nome+
                "\nTelefone: "+super.telefone+
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nData de nascimento: " + dataNascimento;
    }

    
    
}
