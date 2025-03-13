
package com.mycompany.project2;
public class Project2 {

    public static void main(String[] args) {
       System.out.println("Começando a brincadeira de POO");

       // Caneta caneta1 = new Caneta();
        //caneta1.cor = "preto";
        //caneta1.tampada = true;
        
        // caneta1.setCor("azul");
        // String corAtual = caneta1.getCor();
        // caneta1.carga = 100;
        Caneta caneta1 = new Caneta().criarCaneta("vermelha", "fina");

        /*
         Encapsulamento, herança e polimorfismo
        Encapsulamento -> Quando eu restrinjo a minha classe, protegendo os atributos/recursos.
        */

        caneta1.status();

        
    }
}
