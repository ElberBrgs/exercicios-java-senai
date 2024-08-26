/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo016;

/**
 *
 * @author aluno.den
 */
public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("--Admitindo funcionario--");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("--Demitindo funcionario--");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Diretor" + 
                "Salario Final: "+ this.getSalarioFinal()+
                "Premiacao bonus: " + PREMIO;
    }
    
}
