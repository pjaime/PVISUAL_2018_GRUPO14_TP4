/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.beans;

import aplicacion.modelo.dominio.GestorProfesor;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author JAIME
 */
@ManagedBean
@ViewScoped
public class ProfesorBean implements Serializable{
    private GestorProfesor gestorProfesor;
    /**
     * Creates a new instance of ProfesorBean
     */
    public ProfesorBean() {
        gestorProfesor = new GestorProfesor();
    }

    public GestorProfesor getGestorProfesor() {
        return gestorProfesor;
    }

    public void setGestorProfesor(GestorProfesor gestorProfesor) {
        this.gestorProfesor = gestorProfesor;
    }
    
    
    
}
