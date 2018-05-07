/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.primefaces.context.RequestContext;

/**
 *
 * @author JAIME
 */
public class ListaAuto implements Serializable{
    private List<Auto> autos;
    private Auto autoSeleccionado;
    private int posicion;
    public ListaAuto() {
        autos = new ArrayList<>();
        autos.add(new Auto("Ford", "Red", 2012, 200000, true));
        autos.add(new Auto("Mercedes", "White", 2014, 400000, true));
        autos.add(new Auto("Renault", "Green", 2013, 200000, true));
        autos.add(new Auto("Mercesdes", "Brown", 2009, 800000, true));
        autos.add(new Auto("Fiat", "Red", 2012, 200000, true));
        autos.add(new Auto("Volkswagen", "rojo", 2012, 300000, true));
        autos.add(new Auto("BMW", "Yellow", 2012, 900000, true));
        autos.add(new Auto("Audi", "Blue", 2012, 600000, true));
        autos.add(new Auto("Volvo", "White", 2012, 200000, true));
        autos.add(new Auto("Honda", "Blue", 2012, 200000, true));
        
        autoSeleccionado = new Auto();
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public Auto getAutoSeleccionado() {
        return autoSeleccionado;
    }

    public void setAutoSeleccionado(Auto autoSeleccionado) {
        this.autoSeleccionado = autoSeleccionado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
    
    //Seleccionar un auto de la lista
    public void seleccionarAuto(Auto a){
        autoSeleccionado = a;
        posicion = autos.indexOf(a);
        System.out.println("auto"+autoSeleccionado.getColor());
     
    }
    
    public void guardarAutoEditado(){
        autos.set(posicion, autoSeleccionado);
    }
    
   
    
    
    
}
