/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo015;

/**
 *
 * @author aluno.den
 */
public class POO015 {

    public static void main(String[] args) {
        Cachorro bob = new Cachorro();
        Gato luna = new Gato();
        Pato patolino = new Pato();
        
        System.out.println("Chamando cachorro: "+bob.chamarAnimal()+"\nSom do cachorro: "+bob.emitirSom());
        System.out.println("Chamando gato: "+luna.chamarAnimal()+"\nSom do gato:  "+luna.emitirSom());
        System.out.println("Chamando pato: "+patolino.chamarAnimal()+"\nSom do pato:  "+patolino.emitirSom());
    }
}
