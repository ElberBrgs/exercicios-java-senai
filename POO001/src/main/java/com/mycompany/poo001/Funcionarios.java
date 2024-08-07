package com.mycompany.poo001;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class Funcionarios {
    private String nome;
    private String funcao;
    private double salario;
    private String setor;

    //Construtor

    public Funcionarios(String nome, String funcao, double salario,String setor) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
        this.setor = setor;
    }
    
    
    //Métodos acessores.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
    
}
