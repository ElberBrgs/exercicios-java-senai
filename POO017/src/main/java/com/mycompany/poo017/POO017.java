/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo017;

/**
 *
 * @author aluno.den
 */
public class POO017 {

    public static void main(String[] args) {
        Calculadora calculadoraUm = new Calculadora();
        
        System.out.println(calculadoraUm.calcular(2.0, 3.0));
        System.out.println(calculadoraUm.calcular(2,3));
        System.out.println(calculadoraUm.calcular("2", "3"));
    }
}
