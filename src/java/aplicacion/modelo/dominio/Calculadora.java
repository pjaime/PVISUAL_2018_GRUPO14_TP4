/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author JAIME
 */
public class Calculadora {
    private double a;
    private double b;
  

    public Calculadora() {
       
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    
    
    
    public double sumar(){
        return a+b;
    }
    public double restar(){
        return a-b;
    }
    public double multiplicar(){
        return a*b;
    }
    public double dividir(){
        return a/b;
    }
    public double obtenerPotencia(){
        return Math.pow(a, b);
    }
    
    public void asignarNumero(){
        
    }
    
}
