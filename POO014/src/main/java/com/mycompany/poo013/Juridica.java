/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo013;

/**
 *
 * @author Outros
 */
public abstract class Juridica extends Pessoa {
    protected String cnpj;
    protected String inscricaoEstadual;
    protected double valorContrato;

    public Juridica(String cnpj, String inscricaoEstadual, String dataInicio, String dataTermino, double valorContrato, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.valorContrato = valorContrato;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return super.toString()+
               "\n---Pessoa Juridica---" + 
               "\nCnpj: " + cnpj + 
                "\nInscricao estadual: " + inscricaoEstadual + 
                "\nValor do contrato: " + valorContrato;
    }
    
}