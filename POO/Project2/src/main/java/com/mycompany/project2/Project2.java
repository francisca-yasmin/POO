
package com.mycompany.project2;
public class Project2 {

    public static void main(String[] args) {
       System.out.println("Começando a brincadeira de POO");

        Caneta caneta1 = new Caneta();
        caneta1.cor = "preto";
        caneta1.tampada = true;
        caneta1.carga = 100;

        caneta1.status();

        
    }
}
