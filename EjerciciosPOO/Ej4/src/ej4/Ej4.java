package ej4;
import ej4.Entidades.Rectangulo;
import ej4.Servicios.Servicio;
import java.util.*;
public class Ej4 {

    public static void main(String[] args) {
        Servicio svc = new Servicio();
        Rectangulo rec = svc.crearRectangulo();
        System.out.println("Superficie: " + svc.superficie(rec));
        System.out.println("Perimetro: " + svc.perimetro(rec));
        svc.dibujarRectangulo(rec);
    }    
}