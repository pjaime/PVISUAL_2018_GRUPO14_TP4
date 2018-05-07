/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JAIME
 */
public class GestorProfesor {
    private List<Profesor> profesores;
    private Profesor nuevoProfesor;

    public GestorProfesor() {
        profesores = new ArrayList<>();
        profesores.add(new Profesor(100, "Sarabia", "Juan", "Programacion Estructurada"));
        profesores.add(new Profesor(101, "Gutierrez", "Sergio", "Programacion Orientada Objetos"));
        profesores.add(new Profesor(102, "Perez", "Omar", "Programacion y Servicio Web"));
        profesores.add(new Profesor(103, "Torres", "Ricardo", "Base de Datos I"));
        profesores.add(new Profesor(104, "Gonsales", "Ruben", "Redes I"));
        
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public Profesor getNuevoProfesor() {
        return nuevoProfesor;
    }

    public void setNuevoProfesor(Profesor nuevoProfesor) {
        this.nuevoProfesor = nuevoProfesor;
    }
    public void crearNuevoProfesor(Profesor p){
        nuevoProfesor = new Profesor(p.getLegajo(), p.getApellido(), p.getNombre(), p.getEspecialidad());
    }
    public void agregarProfesor(){
        
        profesores.add(nuevoProfesor);
        
    }
    
}
   