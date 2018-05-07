/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.beans;

import aplicacion.modelo.dominio.ListaAuto;
import java.io.Serializable;
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
public class ListaAutoBean implements Serializable{
    private ListaAuto listaAuto;
    /**
     * Creates a new instance of ListaAuto
     */
    public ListaAutoBean() {
        listaAuto = new ListaAuto();
    }

    public aplicacion.modelo.dominio.ListaAuto getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(aplicacion.modelo.dominio.ListaAuto listaAuto) {
        this.listaAuto = listaAuto;
    }
    
    
    
}
