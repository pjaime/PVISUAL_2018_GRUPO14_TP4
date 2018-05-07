/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.beans;

import aplicacion.modelo.dominio.Profesor;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.primefaces.context.RequestContext;

/**
 *
 * @author JAIME
 */
@ManagedBean
@ViewScoped
public class ProfesorFormBean implements Serializable{
    @ManagedProperty (value ="#{profesorBean}")
    private ProfesorBean profesorBean;
    private Profesor nuevoProfesor;
    /**
     * Creates a new instance of ProfesorFormBean
     */
    public ProfesorFormBean() {
        profesorBean = new ProfesorBean();
        nuevoProfesor = new Profesor();
    }

    public ProfesorBean getProfesorBean() {
        return profesorBean;
    }

    public void setProfesorBean(ProfesorBean profesorBean) {
        this.profesorBean = profesorBean;
    }
    
    

    public Profesor getNuevoProfesor() {
        return nuevoProfesor;
    }

    public void setNuevoProfesor(Profesor nuevoProfesor) {
        this.nuevoProfesor = nuevoProfesor;
    }
    
    public void asignarNuevoProfesor(){
        profesorBean.getGestorProfesor().crearNuevoProfesor(nuevoProfesor);
        
    }
    
    
    public void agregarUnProfesor(){
        
        profesorBean.getGestorProfesor().agregarProfesor();
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Operacion concretada","exito"));
        RequestContext.getCurrentInstance().execute("PF('altaProfesor').hide()");
        nuevoProfesor = new Profesor();
        
    }
    
}
