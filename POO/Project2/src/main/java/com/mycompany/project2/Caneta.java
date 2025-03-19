
package com.mycompany.project2;

/**
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

    public void setCor(String newCor){
        if (newCor != null && !newCor.isBlank()){
            this.cor = newCor;
        }else{
            System.out.println("Nova cor inválida");
        }
    }
    
    public String getCor(){
        return this.cor;
    }

    
}
