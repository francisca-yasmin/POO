/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova;

/**
 *
 * @author francisca_yasmin
 */
public class Prova{

    public static void main(String[] args) {
        
     Gerente g = new Gerente("fran", 5000.00, 100.00);
     System.out.println("Salario do gerente: ");
     g.calcular_salario();
     
     Engenheiro en = new Engenheiro("cams", 8000.00, 100.00);
     System.out.println("Salario do engenheiro: ");
     en.calcular_salario();
     
     Estagiario e = new Estagiario("samuel", 3000.00, 100.00);
     System.out.println("Salario do estagiario: ");
     e.calcular_salario();
  
    }
}
