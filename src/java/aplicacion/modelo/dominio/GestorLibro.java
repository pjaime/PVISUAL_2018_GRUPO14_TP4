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
public class GestorLibro {
    private List<Libro> libros;
    private List<String> autores;
    private Libro nuevoLibro;

    public GestorLibro() {
        libros = new ArrayList<>();
        autores = new ArrayList<>();
        nuevoLibro = new Libro();
        
        libros.add(new Libro("1245", "Programar en java", "DEITEL ", 1500));
        libros.add(new Libro("7584", "Programacion Estructurada", "Aguilar Jose", 1500));
        libros.add(new Libro("9652", "Estructura de Datos", "Luis joyanes Aguilar ", 1600));
        libros.add(new Libro("2145", "UML", "Craig Larman ", 500));
        libros.add(new Libro("3256", "JAVA y UML", "Carlos Fontella", 500));
          
 
        autores.add("Joyanes");
        autores.add("Aguilar");
        autores.add("Joyanes");
        autores.add("Joyanes");
        autores.add("Joyanes");
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public Libro getNuevoLibro() {
        return nuevoLibro;
    }

    public void setNuevoLibro(Libro nuevoLibro) {
        this.nuevoLibro = nuevoLibro;
    }
    
    /**
     * Agregar un nuevo libro
     */
    public void agregarNuevoLibro(){
        libros.add(nuevoLibro);
        nuevoLibro = new Libro();
    }
    
}
