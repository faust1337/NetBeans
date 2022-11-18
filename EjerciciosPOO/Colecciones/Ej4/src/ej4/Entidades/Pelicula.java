package ej4.Entidades;
import java.util.*;
public class Pelicula {
    private String director, titulo;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String director, String titulo, Integer duracion) {
        this.director = director;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getTitulo().compareTo(p1.getTitulo());
        }
    };
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getDirector().compareTo(p1.getDirector());
        }
    };
}
