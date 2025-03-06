/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author francisca_yasmin
 */
public class Caneta {
    public int carga;
    public boolean tampada;
    public String cor;
    
    public void status(){ //letra minuscula é metodo
        System.out.println("A cor ad caneta eh" + this.cor);
        System.out.println("A carga esta em: " + this.carga);
        System.out.println("A caneta esta: " + this.tampada);
        
    }
    
}
