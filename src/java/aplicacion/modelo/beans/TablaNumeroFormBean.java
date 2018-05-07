/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.beans;

import aplicacion.modelo.dominio.Numero;
import aplicacion.modelo.dominio.TablaNumero;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author JAIME
 */
@ManagedBean
@ViewScoped
public class TablaNumeroFormBean implements Serializable{
    private int numero;
    private TablaNumero tabla;
    private int maximo;
    private int minimo;
    private double promedio;

  
    /**
     * Creates a new instance of TablaNumeroFormBean
     */
    public TablaNumeroFormBean() {
        tabla = new TablaNumero();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TablaNumero getTabla() {
        return tabla;
    }

    public void setTabla(TablaNumero tabla) {
        this.tabla = tabla;
    }
      public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public void agregarNumeroEnTabla(){
        this.tabla.agregarNumeroEnTabla(numero);
    }
    
    public double obtenerPromedio(){
        return this.tabla.obtenerPromedio();
    }
    
    public int obtenerMaximo(){
        return this.tabla.obtenerMaximo();
    }
    public int obtenerMinimo(){
        return this.tabla.obtenerMinimo();
    }
}
