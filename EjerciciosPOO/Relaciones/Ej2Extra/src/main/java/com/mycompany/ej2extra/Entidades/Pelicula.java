package com.mycompany.ej2extra.Entidades;

public class Pelicula {
    private String titulo, director;
    private Integer edadMinima, duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer edadMinima, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.edadMinima = edadMinima;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
}
