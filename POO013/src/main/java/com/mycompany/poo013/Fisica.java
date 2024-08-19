/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo013;

/**
 *
 * @author aluno.den
 */
public class Fisica extends Pessoa{
    private Sexo sexo;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private double Salario;

    public Fisica(Sexo sexo, String cpf, String rg, String dataNascimento, double Salario, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.Salario = Salario;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n=== Pessoa Fisica===" + 
               "\nSexo: " + sexo + 
               "\nCpf: " + cpf + 
               "\nRg: " + rg + 
               "\nData de nascimento: " + dataNascimento + 
               "\nSalario: " + Salario;
    }
    
}
