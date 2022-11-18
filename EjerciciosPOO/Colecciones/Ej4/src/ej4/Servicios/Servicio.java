package ej4.Servicios;

import ej4.Entidades.Pelicula;
import java.util.*;
public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula cargarPelicula(){
        Pelicula peli = new Pelicula();
        System.out.print("Título de la película: ");
        peli.setTitulo(leer.next());
        System.out.print("Director: ");
        peli.setDirector(leer.next());
        System.out.print("Duración en minutos: ");
        peli.setDuracion(leer.nextInt());
        return peli;
    }
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
        for(Pelicula peli : peliculas){
            System.out.println(peli.getTitulo());
        }
    }
    public void pelisLargas(ArrayList<Pelicula> peliculas){
        System.out.println("\nPelículas con duración mayor a 1 hora.");
        for(Pelicula peli : peliculas){
            if(peli.getDuracion()>60){
                System.out.println("*" + peli.getTitulo());
            }
        }
    }
    public void duracionDescendente(ArrayList<Pelicula> peliculas){
        System.out.println("\nDuracion descendente");
        peliculas.sort(Pelicula.compararDuracion);
        for(Pelicula p : peliculas){
            System.out.println("*" + p.getTitulo());
        }
    }
    public void duracionAscendente(ArrayList<Pelicula> peliculas){
        System.out.println("\nDuracion ascendente");
        //Collections.reverse(peliculas);
        peliculas.sort(Pelicula.compararDuracion.reversed());
        for(Pelicula p : peliculas){
            System.out.println("*" + p.getTitulo());
        }
    }
    public void tituloDescendente(ArrayList<Pelicula> peliculas){
        System.out.println("\nTitulo descendente");
        peliculas.sort(Pelicula.compararTitulo);
        for(Pelicula p : peliculas){
            System.out.println("*" + p.getTitulo());
        }
    }
    public void directorDescendente(ArrayList<Pelicula> peliculas){
        System.out.println("\nDirector descendente");
        peliculas.sort(Pelicula.compararDirector);
        for(Pelicula p : peliculas){
            System.out.println("*" + p.getTitulo());
        }
    }
}