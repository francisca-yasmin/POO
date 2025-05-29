/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author francisca_yasmin
 */
public class Gerente extends Funcionario{
    private double bonus;
    
    //metodo construtor
    public Gerente(String nome, double salario_base, double bonus){
        super(nome, salario_base);
        this.bonus = bonus;
    }
    
    @Override
    public double calcular_salario(){
        return salario_base + getBonus();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    
    
  
}
