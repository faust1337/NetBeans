package ej1;

import Entidades.Libro;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Libro libro = cargarLibro();
        mostrarLibro(libro);
    }
    public static Libro cargarLibro(){
        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.print("ISBN: ");
        libro.isbn = leer.nextLine();
        System.out.print("Título: ");
        libro.titulo = leer.nextLine();
        System.out.print("Cantidad de páginas: ");
        libro.paginas = leer.nextInt();
        return libro;
    }
    public static void mostrarLibro(Libro libro){
        System.out.print("El libro '" + libro.titulo + "' tiene " + libro.paginas + " paginas.");
        System.out.println(" Su ISBN es " + libro.isbn + ".");
    }
}
