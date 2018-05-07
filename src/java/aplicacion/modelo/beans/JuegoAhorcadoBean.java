/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.beans;

import aplicacion.modelo.dominio.JuegoAhorcado;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author casas
 */
@ManagedBean
@ViewScoped
public class JuegoAhorcadoBean implements Serializable{
    private JuegoAhorcado juegoAhorcado;
    
    public JuegoAhorcadoBean() {
        juegoAhorcado = new JuegoAhorcado();    
    }

    /**
     * @return the juegoAhorcado
     */
    public JuegoAhorcado getJuegoAhorcado() {
        return juegoAhorcado;
    }

    /**
     * @param juegoAhorcado the juegoAhorcado to set
     */
    public void setJuegoAhorcado(JuegoAhorcado juegoAhorcado) {
        this.juegoAhorcado = juegoAhorcado;
    }
    
}
