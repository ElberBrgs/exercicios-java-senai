/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo013;

/**
 *
 * @author aluno.den
 */
public class PrestacaoServico extends Juridica{
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServico(String contratoInicio, String contratoFim, String cnpj, String inscricaoEstadual, String dataInicio, String dataTermino, double valorContrato, int id, String nome, String telefone, Endereco endereco) {
        super(cnpj, inscricaoEstadual, dataInicio, dataTermino, valorContrato, id, nome, telefone, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(String contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(String contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return super.toString()+
               "\nInicio do contrato: " + contratoInicio + 
               "\nFim do contrato: " + contratoFim;
    }
    
}
