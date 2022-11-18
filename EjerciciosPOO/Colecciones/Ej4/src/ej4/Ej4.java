package ej4;

import ej4.Entidades.Pelicula;
import ej4.Servicios.Servicio;
import java.util.*;
public class Ej4 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Servicio svc = new Servicio();
        ArrayList<Pelicula> peliculas = new ArrayList();
        char opc;
        do{
            Pelicula peli = svc.cargarPelicula();
            peliculas.add(peli);
            System.out.println("¿Cargar otra pelicula? S/N");
            opc = leer.next().charAt(0);
            opc = Character.toLowerCase(opc);            
        }while(opc=='s');
        svc.mostrarPeliculas(peliculas);
        System.out.println("----------------------");
        svc.pelisLargas(peliculas);
        System.out.println("----------------------");
        svc.duracionAscendente(peliculas);
        System.out.println("----------------------");
        svc.duracionDescendente(peliculas);
        System.out.println("----------------------");
        svc.tituloDescendente(peliculas);
        System.out.println("----------------------");
        svc.directorDescendente(peliculas);
    }
}