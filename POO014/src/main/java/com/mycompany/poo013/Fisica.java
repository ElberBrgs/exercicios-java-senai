package com.mycompany.poo013;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Outros
 */
public abstract class Fisica extends Pessoa{
    protected Sexo sexo;
    protected EstadoCivil estadoCivil;
    protected String cpf;
    protected String rg;
    protected String dataNascimento;
    protected double Salario;

    public Fisica(Sexo sexo,EstadoCivil estadoCivil, String cpf, String rg, String dataNascimento, double Salario, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
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
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
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
                "\n---Pessoa Fisica---" + 
               "\nSexo: " + sexo.getTextoSexo() +
                "\nEstado Civil: "+ estadoCivil.getTextoEstadoCivil()+
               "\nCpf: " + cpf + 
               "\nRg: " + rg + 
               "\nData de nascimento: " + dataNascimento + 
               "\nSalario: " + Salario;
    }
    
}
