/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo012;

/**
 *
 * @author aluno.den
 */
public class POO012 {

    public static void main(String[] args) {
        Motoboy motoboyUm = new Motoboy("321965423", "Jose", "08932165711", "536327489", 5000);
        Engenheiro engenheiroUm = new Engenheiro("1234168723", "Joao", "03305708922", "657892345", 10000);
        Medico medicoUm = new Medico("CRM/BA 573168", "Maria", "38702698733", "657965327", 12000);
        
        System.out.println(motoboyUm);
        System.out.println(engenheiroUm);
        System.out.println(medicoUm);
    }
}
