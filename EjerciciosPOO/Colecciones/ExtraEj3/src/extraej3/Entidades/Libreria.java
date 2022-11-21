package extraej3.Entidades;
import java.util.*;
public class Libreria {
    private HashSet<Libro> libros;
    Libro libro = new Libro();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libreria() {
        libros = new HashSet();
    }
    public Libreria(HashSet<Libro> libros) {
        this.libros = libros;
    }
   
    public HashSet<Libro> getLibros() {
        return libros;
    }
    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }
    public void agregarLibro(Libro l){
        libros.add(l); //Función inventada por mí.
    }
    public void prestamo(){
        System.out.print("Título del libro que desea: ");
        String prestamo = leer.next();
        boolean seEncuentra = false/*boolean si se encuentra el libro*/, limite = false;
        for(Libro l : libros){
            if(l.getTitulo().equalsIgnoreCase(prestamo)){
                seEncuentra = true;//se vuelve true si el libro está en la librería
                if(l.getEjemplaresPrestados()<l.getEjemplares()){
                    l.setEjemplaresPrestados(l.getEjemplaresPrestados()+1);
                }else{
                    limite = true;//se vuelve true si el libro está en la librería, pero no se pueden prestar más.
                }
            }
        }
        if(seEncuentra && limite){
            System.out.println("Lo siento, pero ya no hay más copias disponibles para prestar.");
        }else if(seEncuentra){
            System.out.println("Disfrute de su libro.");
        }else System.out.println("No se encuentran ejemplares.");
    }//Esta función no es como en el ejercicio, pero me gusta más cómo funciona.
    public void devolucion(){
        System.out.print("Título del libro que desea devolver: ");
        String devolver = leer.next();
        boolean seEncuentra = false/*boolean si se encuentra el libro*/, limite = false;
        for(Libro l : libros){
            if(l.getTitulo().equalsIgnoreCase(devolver)){
                seEncuentra = true;
                if(l.getEjemplaresPrestados()>0){
                    l.setEjemplaresPrestados(l.getEjemplaresPrestados()-1);
                }else{
                    limite = true;
                }
            }
        }
        if (seEncuentra && limite){
            System.out.println("Debe haber un error...");
        }else if(seEncuentra){
            System.out.println("Gracias por su devolución.");
        }else System.out.println("No se encuentra este libro en nuestra librería.");
    }
    public void mostrarLibros(){
        for(Libro l : libros){
            System.out.println(l.toString());
        }
    }
    public void mostrarLibro(){
        System.out.print("Titulo a buscar: ");
        String libro = leer.next();
        boolean seEncuentra = false;
        for(Libro l : libros){
            if(l.getTitulo().equalsIgnoreCase(libro)){
                seEncuentra = true;
                System.out.println(l.toString());
            }
        }
        if(!seEncuentra) System.out.println("No se encuentra ese libro.");
    }
}
