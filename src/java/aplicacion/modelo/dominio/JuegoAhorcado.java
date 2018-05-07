package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class JuegoAhorcado implements Serializable{
    private String palabraAdivinar;
    private String ayudaPalabra;
    private int intentos;
    private char[] palabraAhorcado;
    private String imagen;

    public JuegoAhorcado() {
        reiniciarJuego();
    }

    public void reiniciarJuego(){
        palabraAhorcado=new char[10];
        palabraAdivinar = "";
        intentos = 5;
    }
    
    /**
     * @return the palabraAdivinar
     */
    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    /**
     * @param palabraAdivinar the palabraAdivinar to set
     */
    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    /**
     * @return the ayudaPalabra
     */
    public String getAyudaPalabra() {
        return ayudaPalabra;
    }

    /**
     * @param ayudaPalabra the ayudaPalabra to set
     */
    public void setAyudaPalabra(String ayudaPalabra) {
        this.ayudaPalabra = ayudaPalabra;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    /**
     * @return the palabraAhorcado
     */
    public char[] getPalabraAhorcado() {
        return palabraAhorcado;
    }

    public ArrayList<String> getPalabraAhorcadoFormat(){
        ArrayList<String> caracteresPalabra = new ArrayList<String>();
        for (int i = 0; i< palabraAdivinar.length();i++){
            
            caracteresPalabra.add(String.valueOf(palabraAhorcado[i]));
        }
        return caracteresPalabra;
    }
    
    /**
     * @param palabraAhorcado the palabraAhorcado to set
     */
    public void setPalabraAhorcado(char[] palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }
    
    public boolean ingresarLetra(char letra)
    {
        return false;
        
    }
    
    public void empezarJuego(String palabra){
        palabraAdivinar = palabra;
        //palabraAhorcado = palabraAdivinar.toCharArray();
    }
    
    public boolean buscarLetra(char letra){
        boolean encontro = false;
        for (int i=0;i<palabraAdivinar.length();i++){
            if(palabraAdivinar.charAt(i)==letra){
                palabraAhorcado[i]=letra;
                encontro=true;            
            }
        }
        if (encontro == false){
            this.intentos = this.intentos - 1;
           // this.imagen 
            //String imagen;
            this.imagen = "../images/ahorcado" + intentos +".jpg";

           
        }
        
        return encontro;
        
    }
    
    public boolean juegoGanado(){
        boolean ganador = true;
        for (int i=0;i<palabraAdivinar.length();i++){
            if(palabraAdivinar.charAt(i)!= palabraAhorcado[i]){
                ganador = false;
            }
        }
        return ganador;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
