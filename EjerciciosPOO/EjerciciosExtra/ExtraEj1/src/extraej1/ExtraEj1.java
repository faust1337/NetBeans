package extraej1;

import extraej1.Entidades.Cancion;
import java.util.Scanner;

public class ExtraEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Titulo: ");
        String titulo = leer.next();
        System.out.print("Autor: ");
        String autor = leer.next();
        Cancion c = new Cancion(autor,titulo);
        System.out.println(c.toString());
    }    
}