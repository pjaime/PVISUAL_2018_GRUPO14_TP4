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
public class ConversorTemperatura {
    private double numero;

    public ConversorTemperatura() {
    }

    public ConversorTemperatura(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public void asignarValor(double n) {
        this.numero = n;
    }
    
    //METODO CONVERTIR FARENTHEIT A CELSIUS
    public double obtenerCelsiusDeFarentheit(){
       //return 2.8 * numero + 32;
       return 0.55 * (numero - 32);
    }
     //METODO CONVERTIR KELVIN A CELSIUS
    public double obtenerCelsiusDeKelvin(){
        return numero - 273.15 ;
    }
    
    //METODO CONVERTIR CELSIUS A FARENTHEIT
    public double obtenerFarentheitDeCelsius(){
        return numero/0.55 + 32;
    }
    public double obenerFarentheitDeKelvin(){
        return (numero * 1.8 )- 459.67;
    }
    
    public double obenerKelvinDeCelsius(){
        return numero + 273.15;
    }
    public double obenerKelvinDeFarentheit(){
        return numero + 459.67 / (9/5);
    }
    
    
    
}
