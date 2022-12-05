package com.mycompany.ej1extra.Entidades;

public class Perro {
    private String nombre, raza, tamaño;
    private Integer edad;
    private boolean adoptado; 
    public Perro(String nombre, String raza, String tamaño, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
        this.edad = edad;
        adoptado = false;
    }

    public Perro() {
        adoptado = false;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
    
}