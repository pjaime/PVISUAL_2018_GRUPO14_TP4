/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.beans;

import aplicacion.modelo.dominio.GestorLibro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author JAIME
 */
@ManagedBean
@ViewScoped
public class LibroFormBean {
    private GestorLibro gestorLibro;
    /**
     * Creates a new instance of LibroFormBean
     */
    public LibroFormBean() {
        gestorLibro = new GestorLibro();
                
    }

    public GestorLibro getGestorLibro() {
        return gestorLibro;
    }

    public void setGestorLibro(GestorLibro gestorLibro) {
        this.gestorLibro = gestorLibro;
    }
    
}
