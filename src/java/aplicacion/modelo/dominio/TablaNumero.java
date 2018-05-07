/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.ArrayList;

/**
 *
 * @author JAIME
 */
public class TablaNumero {
    private Numero n;
    private ArrayList<Numero> numeros;

    public TablaNumero() {
        numeros = new ArrayList<Numero>();
        numeros.add(new Numero(2));
        numeros.add(new Numero(5));
        numeros.add(new Numero(9));
    }

   
    
    public int obtenerMaximo(){
        int maximo =numeros.get(0).getNumero();
        for(int i=1; i<numeros.size();i++){
            if(maximo < numeros.get(i).getNumero())
                maximo = numeros.get(i).getNumero();
        }
        return maximo;
    
    }
    
    public int obtenerMinimo(){
        int minimo = numeros.get(0).getNumero();
        for(int i=1; i<numeros.size();i++){
            if(numeros.get(i).getNumero() < minimo)
                minimo = numeros.get(i).getNumero();
        }
        return minimo;
    }
    public double obtenerPromedio(){
        double suma = 0;
        for(Numero n: numeros){
            suma = suma + n.getNumero();
        }
        return  suma/numeros.size();
    }
    
    public void agregarNumeroEnTabla(int nuevo){
        //Numero num = new Numero(nuevo);
        this.numeros.add(new Numero(nuevo));
        
    }
    
  

    public ArrayList<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Numero> numeros) {
        this.numeros = numeros;
    }

    public Numero getN() {
        return n;
    }

    public void setN(Numero n) {
        this.n = n;
    }
    
}
