/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo013;

/**
 *
 * @author aluno.den
 */
public class Cliente extends Fisica {
    private String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo,EstadoCivil estadoCivil , String cpf, String rg, String dataNascimento, double Salario, int id, String nome, String telefone, Endereco endereco) {
        super(sexo,estadoCivil , cpf, rg, dataNascimento, Salario, id, nome, telefone, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString()+
               "\nProtocolo de Atendimento: " + protocoloAtendimento;
    }
}
