package com.mycompany.ej2extra.Entidades;
import java.util.ArrayList;
public class Sala {
    private Pelicula pelicula;
    private String[][] sala;
    private Integer precio;
    private ArrayList<Espectador> espectadores;

    public Sala() {
        espectadores = new ArrayList();
    }
    public Sala(Pelicula pelicula, String[][] sala, Integer precio, ArrayList<Espectador> espectadores) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
        this.espectadores = espectadores;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public String[][] getSala() {
        return sala;
    }
    public void setSala(String[][] sala) {
        this.sala = sala;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }
    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }
    
    public void ubicarEspectadores(){
        for(int i = 0; i < espectadores.size(); i++){
            int fila, col;
            do{
                fila = (int)(Math.random()*8); 
                col = (int)(Math.random()*6);
                if(sala[fila][col].length()==2){
                    sala[fila][col] = sala[fila][col].concat("X");
                }
            }while(sala[fila][col].length()==2);
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if(sala[i][j].length()==2){
                    sala[i][j] = sala[i][j].concat(" ");
                }
            }
        }
    }
    public int asd(int i, int j){ //Deprecated (?
        sala[0][0] = sala[0][0].concat("X");
        return sala[i][j].length();
    }
}