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
public class Geladeira {

    //Atributos 
    private String cor;
    private double temperatura;
    private double capacidade = 20.0;
    private int Porta;
    private int voltagem;
    private String modelo;
    private static String marca;
    
    //método acessor para poder usar na main
//    public double getCapacidade(){
//        return this.capacidade;
//    }
//    
//    public void setCapacidade (double novoValor){
//        this.capacidade = novoValor;
//    }
    
    //Construtor 1
    public Geladeira() {
        cor = "roxa";
    }

    //Construtor 2 (Como eu vou contruir - instruções adicionais)
    public Geladeira(String pCor) {
        this.cor = pCor;
    }

    //Contrutor gerado pelo atalho do Insert com todos os Atributos
    public Geladeira(String cor, double temperatura, int Porta, int voltagem, String modelo) {
        this.cor = cor;
        this.temperatura = temperatura;
        this.Porta = Porta;
        this.voltagem = voltagem;
        this.modelo = modelo;
    }
    

    //Métodos Acessores - ATALHO (Alt + Insert)
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPorta() {
        return Porta;
    }

    public void setPorta(int Porta) {
        this.Porta = Porta;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Geladeira.marca = marca;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    
    //Ações - Métodos
    public void ligar() {
        this.temperatura += 1;
    }

    public void ligar(double novaTemp) {
        this.temperatura = novaTemp;
    }

    public void desligar() {
    }

    public void gelar() {
    }

    public void aumentarTemperatura() {
        this.temperatura += 1;
    }

    public void aumentarTemperatura(double novaTemperatura) {
        this.temperatura = novaTemperatura;
    }

    public void diminuirTemperatura() {
    }

}
