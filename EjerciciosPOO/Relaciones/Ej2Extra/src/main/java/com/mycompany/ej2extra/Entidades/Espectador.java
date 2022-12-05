package com.mycompany.ej2extra.Entidades;

public class Espectador {
    private String nombre;
    private Integer edad, dinero;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Integer dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }
    
}
