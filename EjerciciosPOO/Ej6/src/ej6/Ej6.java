package ej6;

import ej6.Entidades.Cafetera;
import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera c = new Cafetera();
        c.llenarCafetera();     
        System.out.println("La cafetera está llena.");
        
        System.out.println("Volumen de la taza a llenar: ");
        int cantidad = leer.nextInt();
        c.servirTaza(cantidad);        
        System.out.println("La cafetera ahora tiene " + c.getCantidadActual() + "ml.");
        
        System.out.println("Cantidad de café a añadir: ");
        cantidad = leer.nextInt();
        c.agregarCafe(cantidad);
        System.out.println("La cafetera ahora tiene " + c.getCantidadActual() + "ml.");
    }    
}