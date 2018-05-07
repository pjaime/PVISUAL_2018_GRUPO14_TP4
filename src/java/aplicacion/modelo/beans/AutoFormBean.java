/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.beans;

import aplicacion.modelo.dominio.Auto;
import aplicacion.modelo.dominio.ListaAuto;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author JAIME
 */
@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable{
    @ManagedProperty(value = "#{listaAutoBean}")
    private ListaAutoBean listaAutoBean;
    /**
     * Creates a new instance of AutoFormBean
     */
    public AutoFormBean() {
        listaAutoBean = new ListaAutoBean();
        
    }

    public ListaAutoBean getListaAutoBean() {
        return listaAutoBean;
    }

    public void setListaAutoBean(ListaAutoBean listaAutoBean) {
        this.listaAutoBean = listaAutoBean;
    }
    
    public void actualizarAuto(){
        listaAutoBean.getListaAuto().guardarAutoEditado();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Operacion concretada","fsafsfaf"));
        RequestContext.getCurrentInstance().execute("PF('confirmaModificaionAuto').hide();PF('editarAuto').hide()");
    }
    
    public void vizualizarVentanaDeConfirmacion(){
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('confirmaModificaionAuto').show();");
    }

    
    
    
    
}
