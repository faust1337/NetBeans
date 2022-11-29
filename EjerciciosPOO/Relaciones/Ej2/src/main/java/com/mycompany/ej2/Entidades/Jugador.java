package com.mycompany.ej2.Entidades;

public class Jugador {
    private int id;
    String nombre;
    boolean mojado;
    //Constructores
    public Jugador() {
        mojado = false;
    }
    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    //Getters y Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isMojado() {
        return mojado;
    }
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public void disparo(Revolver r){
        mojado = r.mojar();
    }
}
