/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.beans;

import aplicacion.modelo.dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author JAIME
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{
    private String n;
    private Calculadora calculadora;
    private Boolean asignado;
    private String operador;
    /**
     * Creates a new instance of CalculadoraFormBean
     */
    public CalculadoraFormBean() {
        calculadora = new Calculadora();
        asignado = true;
        n = new String();
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    public Boolean getAsignado() {
        return asignado;
    }

    public void setAsignado(Boolean asignado) {
        this.asignado = asignado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    
    
    public void asignarNumero(){
        if(asignado==true){
            calculadora.setA(Double.parseDouble(n));
            asignado = false;
        }else{
            calculadora.setB(Double.parseDouble(n));
            asignado = true;
        }
    }
    public void calcularOperacion(){
        asignarNumero();
        if(operador.equals("+")  )
            n = String.valueOf(calculadora.sumar());
        if(operador.equals("-"))
            n = String.valueOf(calculadora.restar());
        if(operador.equals("x"))
            n = String.valueOf(calculadora.multiplicar());
        if(operador.equals("/"))
            n = String.valueOf(calculadora.dividir());
        if(operador.equals("^"))
            n = String.valueOf(calculadora.obtenerPotencia());
    }
    
    public void asignarOperadorSuma(){
        asignarNumero();
        operador = "+";
        n="";
        //System.out.println("operador:"+ operador+ " n"+n+" A:"+calculadora.getA());
    }
     public void asignarOperadorResta(){
        asignarNumero();
        operador = "-";
        n="";
        //System.out.println("operador:"+ operador+ " n"+n+" A:"+calculadora.getA());
    }

    
    //Registra los valores de los numeros
    public void registrarValorBoton(){
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String valorSeleccionado = facesContext.getExternalContext().
                                   getRequestParameterMap().get("valorPresionado");
        n = n + valorSeleccionado;
    }
    
    //registra el operador seleccionado
    public void registrarOperadorBoton(){
        asignarNumero();
        n ="";
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String operadorSeleccionado = facesContext.getExternalContext().
                                   getRequestParameterMap().get("operadorPresionado");
        this.operador = operadorSeleccionado;
    }
    
    public void boorrarDigito(){
        int v = n.length();
        n= n.substring(0,v-1);
        System.out.println("valor"+v);
    }
    
    public void borrar(){
        n="";
    }
   
    
    
   
}
