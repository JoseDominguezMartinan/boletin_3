/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

/**
 *
 * @author jdominguezmartinan
 */
public class Circulo
{
    
    public double radio;
    public static double pi=3.14;
    
    public Circulo()
    {
    }
    public Circulo(double radio)
    {
        this.radio=radio;
    }

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    
    public double calcularArea()
    {
        return pi*(Math.pow(radio,radio));
    }
    public double calcularLonxitude()
    {
        return radio*2*pi;
    }
}
    

