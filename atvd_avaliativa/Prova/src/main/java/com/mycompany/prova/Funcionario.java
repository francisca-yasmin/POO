/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author francisca_yasmin
 */
public class Funcionario {
    private String nome;
    private double salario_base;
    
    //metodo construtor
    public Funcionario(String nome, double salario_base){
        this.nome = nome;
        this.salario_base = salario_base;
    }
    
    //metodo cacular salario
    public double calcular_salario(){
        return getSalario_base();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario_base() {
        return salario_base;
    }


    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }
    
  
}
