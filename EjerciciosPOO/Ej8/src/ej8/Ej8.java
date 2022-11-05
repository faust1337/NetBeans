package ej8;

import ej8.Entidades.Cadena;
import ej8.Servicio.Servicio;
import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio svc = new Servicio();
        System.out.print("Ingrese una frase: ");
        String frase = leer.next();
        Cadena c = new Cadena(frase,frase.length());
        System.out.println("Frase: " + c.getCadena() + "\nLongitud: " + c.getLongitud());
        System.out.println("La frase tiene " + svc.mostrarVocales(c) + " vocales.");
        System.out.print("La frase invertida es: "); svc.invertirFrase(c);
        //System.out.print("Buscar repeticiones de la letra ");
        //String letra = leer.next();
        //System.out.println("La letra está repetida " + svc.vecesRepetido(c, letra) + " veces.");
        //System.out.println("Ingrese una nueva frase para comparar.");
        //String fraseNueva = leer.next();
        //svc.compararFrases(c, fraseNueva);
        //System.out.println(svc.unirFrases(c));
        //svc.reemplazar(c); System.out.println(c.getCadena());
        if(svc.contiene(c)){
            System.out.println("Se encontró la letra.");
        }else System.out.println("No se encontró la letra.");
    }    
}