/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author francisca_yasmin
 */
public class Carro implements Veiculo {
    private int ano;
    private double velocidade;
    private int potenciaMotor;
    private boolean motorLigado;
    private boolean parado;
    private int qtdPassageiro;

    @Override
    public void ligarMotor() {
        if (this.motorLigado == false){
            this.motorLigado = true;
        }
    }

    @Override
    public void desligarMotor() {
        if (this.motorLigado == true){
            this.motorLigado = false;
        }
    }

    @Override
    public void acelerar() {
        if(this.getParado() == true){
            this.setParado(false);
        }
        this.setVelocidade(this.velocidade + 5);
    }

    @Override
    public void frear() {
        if(this.getParado() == false){
            this.setVelocidade(this.velocidade - 5);
        }else{
            this.setVelocidade(0);
            this.setVelocidade(true);
    }

    @Override
    public void subirPassageiro() {
    }

    @Override
    public void descerPassageiro() {
    }
    
}
