/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.projetogeladeira;

/**
 *
 * @author JCardoso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criei o Objeto chamando o contrutor vazio
        //Contrui o primeiro objeto
        Geladeira novaGeladeira = new Geladeira();
        System.out.println(novaGeladeira.getCor());
        
        double capacidade = novaGeladeira.getCapacidade();
        System.out.println(String.valueOf(capacidade));
        
        novaGeladeira.setCapacidade(40.5);
        System.out.println(String.valueOf(novaGeladeira.getCapacidade()));

        //Criei outro Objeto com construtor com parametro 
//        Geladeira outraGeladeira = new Geladeira("cinza");
//        System.out.println(outraGeladeira.getCor());

        //Acionando o método no Main
//        novaGeladeira.aumentarTemperatura();
//        novaGeladeira.aumentarTemperatura();
//        novaGeladeira.aumentarTemperatura();
//        novaGeladeira.aumentarTemperatura(4);
//        System.out.println(String.valueOf(novaGeladeira.getTemperatura()));
    }
}
