/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author jdominguezmartinan
 */
public class Coches {
      private int velocidade ;

    public Coches(){
    velocidade =0 ;
     
}
     public int getvelocidade(){
     return velocidade;
    
    }
     
     public void acelerar (int valor){
         velocidade=velocidade+valor;
     
     }
     public void frenar (int menos){
         velocidade=velocidade-menos;
     }
     
    
}
