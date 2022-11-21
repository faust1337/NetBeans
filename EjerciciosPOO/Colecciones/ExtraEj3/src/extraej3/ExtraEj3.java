package extraej3;
import extraej3.Entidades.Libreria;
import extraej3.Entidades.Libro;
import java.util.*;
public class ExtraEj3 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static HashSet<Libro> libros = new HashSet();
    public static void main(String[] args) {
        Libreria libreria = new Libreria(libros);
        char opc;
        do{
            libros.add(cargarLibro());
            System.out.println("¿Desea cargar otro libro? S/N");
            opc = leer.next().charAt(0); opc = Character.toUpperCase(opc);
            while(opc!='S' && opc!='N'){
                System.out.print("Opción inválida. Reingrese.\nS/N:   ");
                opc = leer.next().charAt(0); opc = Character.toUpperCase(opc); 
            }
        }while(opc=='S');
        libreria.setLibros(libros);
        menu(libreria);
    }
    public static Libro cargarLibro(){
        Libro libro = new Libro();
        System.out.print("Título: ");
        libro.setTitulo(leer.next());
        System.out.print("Autor: ");
        libro.setAutor(leer.next());
        System.out.print("Total de ejemplares: ");
        libro.setEjemplares(leer.nextInt());
        return libro;
    }
    public static void menu(Libreria l){
        int opc;
        do{
            System.out.println("1: Prestamo de libro"
                    + "\n2: Devolución de libro"
                    + "\n3: Agregar libro"
                    + "\n4: Mostrar un libro"
                    + "\n5: Mostrar todos los libros"
                    + "\n6: Salir");
            System.out.print("Opción: "); opc = leer.nextInt();
            switch(opc){
                case 1: l.prestamo(); break;
                case 2: l.devolucion(); break;
                case 3: libros.add(cargarLibro()); l.setLibros(libros); break;
                case 4: l.mostrarLibro(); break;
                case 5: l.mostrarLibros(); break;
                case 6: System.out.println("Fin."); break;
                default: System.out.println("Opción inválida.");
            }
        }while(opc!=6);
    }
}