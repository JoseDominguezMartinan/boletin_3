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
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coches coche1=new Coches();
     coche1.acelerar(50);
        coche1.frenar(30);
        System.out.println("velocidade= "+coche1.getvelocidade());
    }
    
}
